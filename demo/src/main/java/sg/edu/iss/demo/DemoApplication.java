package sg.edu.iss.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import sg.edu.iss.demo.domain.Department;
import sg.edu.iss.demo.domain.Employee;
import sg.edu.iss.demo.domain.ParkingSpace;
import sg.edu.iss.demo.domain.Project;
import sg.edu.iss.demo.domain.Student;
import sg.edu.iss.demo.repo.DepartmentRepository;
import sg.edu.iss.demo.repo.EmployeeRepository;
import sg.edu.iss.demo.repo.ProjectRepository;
import sg.edu.iss.demo.repo.StudentRepository;

@SpringBootApplication
public class DemoApplication {
	
	@Autowired
	StudentRepository srepo;
	
	@Autowired
	EmployeeRepository emprepo;
	
	@Autowired
	ProjectRepository pjrepo;
	
	@Autowired
	DepartmentRepository deptrepo;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@Bean
	CommandLineRunner runner() {
		return args ->{
			
			
			/*
			 * Student s1 = new Student("Hou Lu", "Sweet", null, 5000.00, 4.50); Student s2
			 * = new Student("Zerita", "Nice", null, 5000.00, 4.50); Student s3 = new
			 * Student("Austin", "Rationlist", null, 5000.00, 4.50); Student s4 = new
			 * Student("Benjo", "ExamSmart", null, 5000.00, 4.50); srepo.save(s1);
			 * srepo.save(s2); srepo.save(s3); srepo.save(s4); List<Student> list =
			 * srepo.findAll(); for(Student student: list) {
			 * System.out.println("Record from DB"+ student.toString()); }
			 */
			/*
			 * //cgpa and fee finder List<Student> list1=
			 * srepo.findStudentsByCgpaAndFee(4.5, 5000.00); System.out.println("Finder1");
			 * for(Student student: list1) { System.out.println("Record from DB"+
			 * student.toString()); }
			 * 
			 * //nickname finder List<Student> list2= srepo.queryStudentsByName("S");
			 * System.out.println("Finder2"); for(Student student: list2) {
			 * System.out.println("Record from DB"+ student.toString()); }
			 * 
			 * //name finder List<Student> list3= srepo.queryStudentsByName("Z");
			 * System.out.println("Finder3"); for(Student student: list3) {
			 * System.out.println("Record from DB"+ student.toString()); }
			 */
			 
			
			/*
			 * ParkingSpace ps = new ParkingSpace(1, "25 HMKT"); Employee emp = new
			 * Employee("Robert", 1000); emp.setParkingSpace(ps); Department dept = new
			 * Department("Office Politics"); deptrepo.save(dept); emp.setDepartment(dept);
			 * Project p1= new Project("Secret DSTA"); Project p2 = new
			 * Project("Trace Together"); pjrepo.save(p1); pjrepo.save(p2); List<Project>
			 * plist = new ArrayList<Project>(); plist.add(p1);plist.add(p2);
			 * emp.setProjects(plist); emprepo.save(emp);
			 */
			
		};
	}

}
