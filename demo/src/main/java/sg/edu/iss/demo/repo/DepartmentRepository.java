package sg.edu.iss.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import sg.edu.iss.demo.domain.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
