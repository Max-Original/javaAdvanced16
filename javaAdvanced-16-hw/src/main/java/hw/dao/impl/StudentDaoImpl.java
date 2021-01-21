package hw.dao.impl;

import java.util.ArrayList;
import java.util.List;

import hw.Student;
import hw.dao.StudentDao;

public class StudentDaoImpl implements StudentDao{

	private static StudentDaoImpl studentDaoImpl;
	private List <Student> list = new ArrayList();
	  
	
	public static StudentDaoImpl getStudentDaoImpl() {
	        if (studentDaoImpl == null) {
	        	studentDaoImpl = new StudentDaoImpl();
	        }
	        return studentDaoImpl;
	    }

	private StudentDaoImpl() {
	}
	
	@Override
	public Student creat(Student student) {
		
		list.add(student);
		
		return student;
	}

	@Override
	public Student read(Integer id) {
		Student student = list.get(id);
		return student;
	}

	@Override
	public Student update(Student student) {
		
		Student studentToUpdate = list.get(student.getId());
		if(studentToUpdate != null) {
			studentToUpdate.setName(student.getName());
			studentToUpdate.setAge(student.getAge());
		}else {
			System.out.println("user not found, error 404 =)");
		}
		return studentToUpdate = list.get(student.getId());
	}

	@Override
	public void delete(int id) {
		list.remove(id);
	}

	@Override
	public List<Student> readAll() {
		return list;
	}
	
	public void clear() {
		list.clear();
	}
}
