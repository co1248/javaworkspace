
public class Car {
	//����(�Ӽ�)
	String company = "�����ڵ���"; //����� �������
//	String model = "�׷���";
//	String color = "����";
//	int maxSpeed = 350;
//	int speed; //�⺻���� �ʱ�ȭ �Ǿ���. 0
	
//	String company;
	String model;
	String color;
	int maxSpeed;
	int speed;
//	//������(��������� �ʱ�ȭ)
//	Car() {
//		this("�Ѽ��ڵ���", "BMW"); //�� �ƴ� ���� ���� Ŭ�����ȿ� ���� �Ǿ��ִ� �ٸ� �����ڸ� ȣ����
//		company = "�����ڵ���";
//		model = "�׷���";
//	}
//	Car(������ ��ֳķ� ����) {}
//	Car(String c, String m) { //�Ű������� �޾ƿ�
//		company = c;
//		model = m;
//	}

	//������ �����ε� ������(���� ���� X, �Ű������� ������ �޶�� �Ѵ�.)
	//�����ڸ� ������ �⺻���� �ڵ������ڰ� �����ȴ�. �ڹٴ� �⺻���� �ڵ����� �����ǰ� ��������ִ�.
	Car() {
		
	}
	Car(String model) {
		this(model, "����", 250);
	}
	Car(String model, String color) {
		this(model, color, 250);
	}
	Car(String model, String color, int maxSpeed) {
		this.model = model; //this.Ŭ������ �Ű����� = �������� �Ű����� (�� ������ �̸��� ���� ��)
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	//�޼ҵ�(���)
    void keyTurnOn() {
    	System.out.println("�õ��� �ɴ�.");
    }
    void keyTurnOff() {
    	System.out.println("�õ��� ����.");
    }
    void accel() {
    	for(int i = 0; i < 200; i++) {
    		speed = i;
    		System.out.println(speed);
    	}
    	
    }
}
