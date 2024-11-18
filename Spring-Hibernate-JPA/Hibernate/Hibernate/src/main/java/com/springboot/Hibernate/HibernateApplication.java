package com.springboot.Hibernate;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.springboot.Hibernate.DAO.StudentDAO;
import com.springboot.Hibernate.entity.Student;

@SpringBootApplication
public class HibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernateApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner ->{
			// getStudents(studentDAO);
			// lastname(studentDAO);
			// update(studentDAO);
			// delete(studentDAO);
			deleteallrows(studentDAO);
		};
	}
   
	
	private void readStudent(StudentDAO studentDAO){
		System.out.println("CREATING NEW STUDENT OBJECT........");
		Student thestudent=new Student("elon","musk","elon00@gmail.com");
        System.out.println("SAVING THE STUDENT.......");
		studentDAO.save(thestudent);

		System.out.println("GENERATING THE CREATED STUDENT..:"+thestudent.getId());
        

        int theID=thestudent.getId();
        System.out.println("THE ID IS:"+theID);
		Student getstudent=studentDAO.findbyId(theID);
		System.out.println("getting ID" +getstudent);

	}

	private void getStudents(StudentDAO studentDAO){
     List<Student> thestudents=studentDAO.findAll();

	 for(Student stu:thestudents){
		System.out.println(stu);
	 }
	}
    private void lastname(StudentDAO studentDAO){
		List<Student> thestudent=studentDAO.findbyLastName("ahamed");

		for(Student stu:thestudent){
			System.out.println(stu);
		}
		}
     

	private void update(StudentDAO studentDAO){
		int stuid=1;
        Student stu=studentDAO.findbyId(stuid);
		System.out.println("the ID FOUND IS OF="+stu);

		stu.setLastName("martin");
		studentDAO.update(stu);
		System.out.println("THE UPDATED NAME OF THE STUDENT IS OF:"+studentDAO.findbyId(stuid));
	}

	private void delete(StudentDAO studentDAO){
		int stuid=4;
		System.out.println("DELETED THE STUDENT OF ID:"+stuid);
		studentDAO.delete(stuid);
	}

	private void deleteallrows(StudentDAO studentDAO){
		System.out.println("DELETING ALL THE ROWS");
		int num=studentDAO.DeleteAll();
		System.out.println("DELETED="+num+" ROWS FROM THE STUDENT TABLE");
	}
	}

