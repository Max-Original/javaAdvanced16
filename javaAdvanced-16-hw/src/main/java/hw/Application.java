package hw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import hw.dao.impl.StudentDaoImpl;

@SpringBootApplication
public class Application {

	public static void main(String [] args) {
		
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
		
		StudentDaoImpl student = (StudentDaoImpl) ctx.getBean("student");
		
		Student studentFirst = new Student(0, "Max", 13);
		
		Student studentForUpdate = new Student(0, "Masha", 13);
		
		student.creat(studentFirst);
		
		System.out.println(student.read(0));
		
		System.out.println(student.update(studentForUpdate));
		
		student.creat(new Student(66, "Julia", 66));
		
		System.out.println(student.readAll() +  "read all");
		
		student.delete(0);
		
		System.out.println(student.read(0) + "read 0");
		
		
		
		student.clear();
	}
	
}
