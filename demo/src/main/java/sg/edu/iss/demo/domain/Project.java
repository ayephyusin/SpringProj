package sg.edu.iss.demo.domain;

import java.util.Collection;

import javax.persistence.*;

@Entity
public class Project {
	@Id @GeneratedValue(strategy =GenerationType.IDENTITY)
	private int id;
	private String name;
	@ManyToMany(mappedBy = "projects")
	private Collection<Employee> employees;
	public Project() {
		super();
	}
	public Project(String name) {
		super();
		this.name = name;
	}
	public Project(String name, Collection<Employee> employees) {
		super();
		this.name = name;
		this.employees = employees;
	}
	public Project(int id, String name, Collection<Employee> employees) {
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
	@Override
	public String toString() {
		return "Project [id=" + id + ", name=" + name + "]";
	}
	

}
