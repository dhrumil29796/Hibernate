package lti.bank.repo;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import lti.bank.bean.Account;
import lti.util.HibernateUtil;

public class TestBank {

	@Test
	public void testCreateAccount() {
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		Account acc = new Account(123,"Viral",5000);
		session.save(acc);
		tx.commit();
	}
	@Test
	public void testWithdraw() {
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		Account acc= (Account) session.get(Account.class, 123);
		lti.bank.bean.Transaction trans = new lti.bank.bean.Transaction();
		trans.setId(200);
		trans.setType("savings");
		trans.setAmount(1000);
		double balance =acc.getBalance();
		double amount = trans.getAmount();
		balance = balance-amount;
		System.out.println(balance);
		
	}
}
