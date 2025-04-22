package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "my program started!" );
        //spring jdbc template
        ApplicationContext context= new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        //JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
        
        //insert query
       // String query= "insert into student(id,name,city) values(?,?,?)";
        
        //fire query
		/*
		 * int result= template.update(query,56,"gungun","hyd");
		 * System.out.println("no. of record inserted: "+result);
		 */
        
        StudentDao studentDao= context.getBean("studentDao",StudentDao.class);
        Student student= new Student();
        student.setId(8);
        student.setName("niti");
        student.setCity("knp");
        
        int res= studentDao.insert(student);
        System.out.println("student added "+ res );
    }
}
