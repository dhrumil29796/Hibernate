import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import lti.pojo.one2many.Department;
import lti.pojo.one2many.Employee;
import lti.util.HibernateUtil;

public class TestEmployee {
	@Test
	public void testCase1() {
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();

		Department dept = new Department();
		dept.setDeptno(100);
		dept.setName("Polo");
		dept.setLocation("Mumbai");
		
		session.save(dept);
		tx.commit();
		
	}
	
	@Test
	public void testCase2() {
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		Department dept= (Department) session.get(Department.class, 10);
		Employee emp = new Employee();
		emp.setEmpno(10);
		emp.setName("Dhrumil");
		emp.setSalary(10000.0);
		emp.setDept(dept);
		
		session.save(emp);
		tx.commit();
	}
	
	@Test
	public void test3() {
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		
		Department d = (Department) session.get(Department.class, 10);
		System.out.println(d.getName());
		System.out.println(d.getEmployees()); 
		tx.commit();
	}
}
