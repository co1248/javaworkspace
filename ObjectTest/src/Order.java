
public class Order {
	long orderNumber;
	String orderId;
	String orderDate;
	String orderName;
	String orderPno;
	String address;
	
//	Order(long orderNumber, String orderId, String orderDate, String orderName, String orderPno, String address) {
//		this.orderNumber = orderNumber;
//		this.orderId = orderId;
//		this.orderDate = orderDate;
//		this.orderName = orderName;
//		this.orderPno = orderPno;
//		this.address = address;
//	}
	
	public Order(long orderNumber, String orderId, String orderDate, String orderName, String orderPno,
			String address) {
		super();
		this.orderNumber = orderNumber;
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.orderName = orderName;
		this.orderPno = orderPno;
		this.address = address;
	}

	public void orderPrint() {
		System.out.println("주문번호 : " + orderNumber);
		System.out.println("주문자아이디 : " + orderId);
		System.out.println("주문날짜 : " + orderDate);
		System.out.println("주문자명 : " + orderName);
		System.out.println("주문제품번호 : " + orderPno);
		System.out.println("배송주소 : " + address);
	}

}
