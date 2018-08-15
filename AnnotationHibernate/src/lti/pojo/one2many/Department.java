package lti.pojo.one2many;

import java.util.HashSet;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.*;

@Entity
@Table(name = "depts_jpa")
public class Department {
	@Id
	private int deptno;
	private String name;
	private String location;

	@OneToMany(mappedBy = "dept", cascade = {
			CascadeType.ALL }, fetch = FetchType.EAGER) /* to avoid lazy update by default lazy */
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Set<Employee> employees = new HashSet<Employee>();

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
}
