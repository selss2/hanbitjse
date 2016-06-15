/**
 * 
 */
package bank;

/**
 * @date :2016. 6. 15.
 * @author :오승준
 * @file :Bank.java
 * @story :
 */
public class Bank {
	private int account; // 인스턴스 변수는 초기화를 하지 않는다
	private String name;
	private int money;
	private String bankName;
	private String pw;
	private String id;

	public void setAccount(int account) {
		this.account = account;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void setBankname(String bankName) {
		this.bankName = bankName;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getAccount() {
		return this.account;
	}

	public String getName() {
		return this.name;
	}

	public int getMoney() {
		return this.money;
	}

	public String getBankName() {
		return this.bankName;
	}

	public String getPw() {
		return this.pw;
	}

	public String getId() {
		return this.id;
	}
}