package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Course;
import dmacc.beans.Student;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.StudentRepository;

@SpringBootApplication
public class StudentInfoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentInfoApplication.class, args);
	}

	@Autowired
	StudentRepository repo;

	
	@Override
	public void run(String... args)throws Exception{
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);

		Student s = appContext.getBean("student", Student.class);
		s.setId(1);
		s.setName("Kalpana Prajapati");
		s.setPhone("515-123-1234");
		s.setEmailAddress("kalpana.Prajapati@dmacc.edu");
		repo.save(s);


		Student st = new Student("Tara Hills", "515-123-4567", "Hi@gmail.com");
		Course c = new Course(121, "Intro to Programming", "Mr. Harry");
		st.setCourse(c);
		repo.save(st);

		List<Student> allMyStudents = repo.findAll();
		for(Student student: allMyStudents) {
			System.out.println(student.toString());
		}
		((AbstractApplicationContext) appContext).close();
	}
}
