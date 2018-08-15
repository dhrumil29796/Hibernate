package lti.pojo.jointable;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import lti.util.HibernateUtil;

public class TestBillingDetails {

	@Test
	public void testCase1() {
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();

		/*BillingDetails bd = new BillingDetails();
		bd.setId(111);
		bd.setNumber("12345");
		bd.setOwner("Polo");*/
		
		BankAccount bankAcc = new BankAccount();
		bankAcc.setOwner("Polo");
		bankAcc.setNumber("12345");
		bankAcc.setBankName("ICICI Bank");

		CreditCard creditCard = new CreditCard();
		creditCard.setOwner("Polo");
		creditCard.setNumber("412901234567890");
		creditCard.setType("VISA");
		creditCard.setExpiryMonth("12");
		creditCard.setExpiryYear("2099");
		/*session.save(bd);*/
		session.save(bankAcc);
		session.save(creditCard);
		
		tx.commit();
	}
}
