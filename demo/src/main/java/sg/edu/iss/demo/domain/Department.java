package sg.edu.iss.demo.domain;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.*;
@Entity
public class Department {
	@Id @GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
    private String name;
    @OneToMany(mappedBy="department")
    private Collection<Employee> employees;
    
    
	public Department() {
		super();
		this.employees = new ArrayList<Employee>();
	}


	public Department(String name) {
		super();
		this.name = name;
	}
	//


	public Department(int id, String name, Collection<Employee> employees) {
		super();
		this.id = id;
		this.name = name;
		this.employees = employees;
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


	public Collection<Employee> getEmployees() {
		return employees;
	}


	public void setEmployees(Collection<Employee> employees) {
		this.employees = employees;
	}
	
	public void addEmployee(Employee employee) {
		this.employees.add(employee);
	}


	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}
    
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		if (id != other.id)
			return false;
		return true;
	}
    
    
}
