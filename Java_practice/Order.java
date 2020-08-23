package chapter5;

public class Order {
	long number;
	String id;
	String date;
	String name;
	String productId;
	String address;

}

package chapter5;

public class OrderTest {
	public static void main(String[] args) {
		Order order = new Order();
		
		order.number = 201907210001L;
		order.id = "abc123";
		order.date = "2020년 08월 22일";
		order.name = "홍길순";
		order.productId = "PD345-12";
		order.address = "대구시 달서구";
		
		System.out.println("주문번호 : " + order.number);
		System.out.println("주문자 아이디 : " + order.id);
		System.out.println("주문 날짜 : " + order.date);
		System.out.println("주문자 이름 : " + order.name);
		System.out.println("주문 상품 번호 : " + order.productId);
		System.out.println("배송 주소 : " + order.address);
		
	}

}

--------------------------------------------------------------------------------

출력 결과 :
주문번호 : 201907210001
주문자 아이디 : abc123
주문 날짜 : 2020년 08월 22일
주문자 이름 : 홍길순
주문 상품 번호 : PD345-12
배송 주소 : 대구시 달서구
