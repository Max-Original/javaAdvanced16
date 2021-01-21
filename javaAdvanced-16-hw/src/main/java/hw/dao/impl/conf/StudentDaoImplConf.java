package hw.dao.impl.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import hw.dao.impl.StudentDaoImpl;

@Configuration
public class StudentDaoImplConf {

	@Bean(name="student")
	public StudentDaoImpl getStudentDaoImplConf() {
		
		StudentDaoImpl daoImpl = StudentDaoImpl.getStudentDaoImpl();
		
		return daoImpl;
	}
	
}
