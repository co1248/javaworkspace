
public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car(); //��ü�� ����. c�� �ּҸ� �˰��ִ�. Car() - �������� ȣ��
		System.out.println("car1.company : " + car1.company);
		System.out.println();
		
		Car car2 = new Car("�ڰ���");
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println();
		
		Car car3 = new Car("�ڰ���", "����");
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println();
		
		Car car4 = new Car("�ڰ���", "����", 200);
		System.out.println("car4.company : " + car4.company);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);
		System.out.println();
		
		
		
		
//		Car c2 = new Car("����ڵ���", "k8");
//		System.out.println(c2.company);
	
//		System.out.println(c2.company); //.����������
//		c2.company = "����ڵ���";
//		System.out.println(c2.company);
//		c2.speed = 60;
//		System.out.println(c2.speed);
		
		Car c3 = new Car("�����ڸ���", "E250");
		c3.keyTurnOn();
		c3.accel();
		c3.keyTurnOff();
		

	}

}