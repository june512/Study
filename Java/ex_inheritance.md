Customer.java
```
package inheritance;

public class Customer {

	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
//	public Customer() {
//		customerGrade = "SILVER";
//		bonusRatio = 0.01;
//		
//		System.out.println("Customer() 생성자 호출");
//	}
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		
//		System.out.println("Customer(int, String) 생성자 호출");
	}
	
	public int calcPrice(int price) {
		bonusPoint += price*bonusRatio;
		return price;
	}
	
	public String ShowCutomerInfo() {
		return customerName + "님의 등급은 " + customerGrade + "이며, 적립된 포인트는 " + bonusPoint + "점 입니다.";
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
}
```

VIPCustomer.java
```
package inheritance;

/*
public class VIPCustomer {

	private int customerID;
	private String customerName;
	private String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	double salesRatio;
	private int agentID;
	
	public VIPCustomer() {
		
	}
}
*/

// 상속
public class VIPCustomer extends Customer {
	
	double salesRatio;
	private int agentID;
	
//	public VIPCustomer() {
//		
//		customerGrade = "VIP";
//		bonusRatio = 0.05;
//		salesRatio = 0.1;
//		
//		System.out.println("VIPCustomer() 생성자 호출");
//	}
	
	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);

		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
//		System.out.println("VIPCustomer(int, String) 생성자 호출");
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);

	}	
}
```

CustomerTest.java
```
package inheritance;

public class CustomerTest {

	public static void main(String[] args) {

//		Customer customerLee = new Customer();
//		customerLee.setCustomerName("이순신");
//		customerLee.setCustomerID(10010);
//		customerLee.bonusPoint = 1000;
//		System.out.println(customerLee.ShowCutomerInfo());
		
//		VIPCustomer customerKim = new VIPCustomer();
		VIPCustomer customerKim = new VIPCustomer(10020, "김유신");
//		customerKim.setCustomerName("김유신");
//		customerKim.setCustomerID(10020);
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.ShowCutomerInfo());
	}

}
```

OverridngTest.java
```
package inheritance;

public class OverridngTest {

	public static void main(String[] args) {
		Customer customerLee = new Customer(10010, "이순신");
		customerLee.bonusPoint = 1000;
		
		VIPCustomer customerKim = new VIPCustomer(10020, "김유신");
		customerKim.bonusPoint = 10000;
		
		int priceLee = customerLee.calcPrice(10000);
		int priceKim = customerKim.calcPrice(10000);
		
		System.out.println(customerLee.ShowCutomerInfo() + " 지불금액은 " + priceLee + "입니다.");
		System.out.println(customerKim.ShowCutomerInfo() + " 지불금액은 " + priceKim + "입니다.");
		
		Customer customerNo = new VIPCustomer(10030, "박지원");
		customerNo.bonusPoint = 100000;
		System.out.println(customerNo.ShowCutomerInfo() + " 지불금액은 " + customerNo.calcPrice(10000) + "입니다.");
	}
}
```

======================================================================================================================
출력 화면:
```
이순신님의 등급은 SILVER이며, 적립된 포인트는 1100점 입니다. 지불금액은 10000입니다.
김유신님의 등급은 VIP이며, 적립된 포인트는 10500점 입니다. 지불금액은 9000입니다.
박지원님의 등급은 VIP이며, 적립된 포인트는 100000점 입니다. 지불금액은 9000입니다.
```
