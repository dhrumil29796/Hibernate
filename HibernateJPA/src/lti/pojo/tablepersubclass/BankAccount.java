package lti.pojo.tablepersubclass;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="bankaccount_details_jpa_2")
public class BankAccount extends BillingDetails {

	private String bankName;
	
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
}
