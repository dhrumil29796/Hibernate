import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;

import lti.pojo.Customer;
import lti.util.HibernateUtil;

public class SQLDEMO {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSession();
		/*
		 * String sql = "select * from cust where cust_id=1041"; SQLQuery query =
		 * session.createSQLQuery(sql); Customer cust = (Customer)
		 * query.addEntity(Customer.class).uniqueResult();
		 * System.out.println(cust.getCustName() + "\t" + cust.getCreditLimit());
		 */

		/*
		 * String sql = "select cust_id, cust_name from cust"; List customers =
		 * session.createSQLQuery(sql).list(); for (Object cust : customers) { Object[]
		 * fields = (Object[]) cust; System.out.println(fields[0] + "\t" + fields[1]); }
		 */
		/*
		 * SQLQuery query = (SQLQuery) session.getNamedQuery("getCustNames");
		 * query.list().forEach(System.out::println);
		 */
		session.getNamedQuery("getCustNames").list().forEach(System.out::println);

	}
}
