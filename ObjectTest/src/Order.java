
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
		System.out.println("�ֹ���ȣ : " + orderNumber);
		System.out.println("�ֹ��ھ��̵� : " + orderId);
		System.out.println("�ֹ���¥ : " + orderDate);
		System.out.println("�ֹ��ڸ� : " + orderName);
		System.out.println("�ֹ���ǰ��ȣ : " + orderPno);
		System.out.println("����ּ� : " + address);
	}

}
