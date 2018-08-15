package lti.pojo.jointable;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="bankaccount_details_jpa_4")
@PrimaryKeyJoinColumn(name="billing_id", referencedColumnName="id")
public class BankAccount extends BillingDetails {

	private String bankName;
	
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
}
