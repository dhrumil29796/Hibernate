import java.util.List;

import org.hibernate.Query;

import org.hibernate.Session;

import lti.pojo.Customer;
import lti.util.HibernateUtil;

public class HQLDemo {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSession();

		/*
		 * String hql = "from Customer"; Query query = session.createQuery(hql);
		 * List<Customer> customers = query.list();
		 * 
		 * for (Customer cust : customers) System.out.println(cust.getCustId() + "\t" +
		 * cust.getCustName());
		 */

		/*
		 * List<Customer> customers =
		 * session.createQuery("from Customer where creditLimit>200 order by custName").
		 * list();
		 * 
		 * for (Customer cust : customers) System.out.println(cust.getCustId() + "\t" +
		 * cust.getCustName());
		 */

//		Customer cust = (Customer) session.createQuery("from Customer where custId=1005").uniqueResult();
//		System.out.println(cust.getCustId() + "\t" + cust.getCustName());

//		 Query query = session.createQuery("from Customer where custName=:cname");
//		 query.setString("cname", "Vivek");
//		 Customer cust = (Customer) query.uniqueResult();
//		
//		System.out.println(cust.getCustId() + "\t" + cust.getCustName());
		
		Query query = session.getNamedQuery("getAllCust");
		for (Customer cust : (List<Customer>)query.list())
				System.out.println(cust.getCustId() + "\t" + cust.getCustName());
	}
}
