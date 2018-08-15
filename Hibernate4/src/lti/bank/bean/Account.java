package lti.bank.bean;

import java.util.HashSet;
import java.util.Set;


public class Account {
	private int actno;
	private String holder;
	private int balance;
	private Set<Transaction> txns = new HashSet<Transaction>();

	public Account(int actno, String holder, int balance) {
		this.actno = actno;
		this.holder = holder;
		this.balance = balance;
	}

	public int getActno() {
		return actno;
	}

	public void setActno(int actno) {
		this.actno = actno;
	}

	public int getActNo() {
		return actno;
	}

	public void setTxns(Set<Transaction> txns) {
		this.txns = txns;
	}

	public void setActNo(int actNo) {
		this.actno = actNo;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public Set<Transaction> getTxns() {
		return txns;
	}

}
