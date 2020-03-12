package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;


@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String phone;
	private String emailAddress;
	
	@Autowired
	private Course course;

	public Student() {
		super();
		this.emailAddress = "tony@gmail.com";
	}

	public Student(String name) {
		this.name = name;

	}

	public Student(String name, String phone, String emailAddress) {
		this.name = name;
		this.phone = phone;
		this.emailAddress = emailAddress;

	}

	public Student(int id, String name, String phone, String emailAddress) {
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.emailAddress = emailAddress;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", phone=" + phone + ", emailAddress=" + emailAddress
				+ ", course=" + course + "]";
	}

	

}
