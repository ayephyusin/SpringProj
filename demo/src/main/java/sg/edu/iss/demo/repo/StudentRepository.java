package sg.edu.iss.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sg.edu.iss.demo.domain.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	List<Student> findStudentsByCgpaAndFee(double cgpa,double fee);

	@Query("select s from Student s where s.nickName like %?1 ")
	List<Student> queryStudentsByNickName(String nn);
	
	@Query("select s from Student s where s.name like :name")
	List<Student> queryStudentsByName(@Param("name")String name);
}
