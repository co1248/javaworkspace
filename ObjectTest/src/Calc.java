
public class Calc {
	//�޼ҵ�(���)
	//����Ÿ�� �޼ҵ��([�Ű�����1,....]-��������) {
	//    [return ���ϰ�;]-��������
	//}
	//����Ÿ��(void, �⺻��Ÿ��, ������-Ŭ����Ÿ��)
	
//	public void add() {
//		System.out.println(3 + 5);
//	}
//	
//	public void add2(int x, int y) {
//		System.out.println(x + y);
//	}
//	
//	public int add3(int x, int y) {
//		int sum = x + y;
//		return sum;
//	}
//	
//	public double add4(double x, double y) { //����ȯ����
//		return x + y;
//	}
	
//	public int minus(int x, int y) {
//		return x - y;
//	}
//	public int multiply(int x, int y) {
//		return x * y;
//	}
//	public double divide(int x, int y) {
//		return (double)x / y;
//	}
//	
//	public int sum(int ... values) { //������ �޼ҵ�, �������Լ�
//		//���� �迭������ �Ѿ�´�.
//		int sum = 0;
//		for(int num : values) {
//			sum += num;			
//		}
//		return sum;
//	}
	
	//�����ε�
	//1. �޼ҵ��� �̸��� ���ƾ� �Ѵ�.
	//2. �� �Ű������� Ÿ�� �Ǵ� ������ �޶�� �Ѵ�.
	
//	void add() {
//		System.out.println(5 + 7);
//	}
//	
//	void add(int x) {
//		System.out.println(x);
//	}
	
//	int add(int x) { --���ϰ��� �ٸ��� �����ε��� ������ �ƴϴ�.
//		System.out.println(x);
//	}
	
//	void add(double x) {
//		System.out.println(x);
//	}
//	
//	void add(int x, int y) {
//		System.out.println(x + y);
//	}
//	
//	void add(int x, long y) {
//		System.out.println(x + y);
//	}
//	
//	void add(long x, int y) {
//		System.out.println(x + y);
//	}
	
//	add(10L,20)
	
	//���� - �ν��Ͻ� ���� (int iv) �����ڿ� ���� �ʱ�ȭ ����, ������ �� ���� �Ҵ�Ǿ� ��
	//    - Ŭ����(static����)���� (static int cv) �����ڿ� ���� �ʱ�ȭ �Ұ�, �ѹ��� �Ҵ� �Ǿ���(��� ��ü�� �����Ѵ�.), ��ü�� �������� ��밡�� (Ŭ�����̸�.������)
	//��� - ������ �Ұ��� ���� (final double PI), �ݵ�� �ʱ�ȭ �ؼ� �����Ѵ�. �����ڸ� ����� �ʱ�ȭ�� �����ϴ�.
	//������
	//�޼ҵ� - �ν��Ͻ� �޼ҵ� (void add() {})
	//     - Ŭ����(static) �޼ҵ� (static void add() {}), ��ü�� �������� ��밡��(Ŭ�����̸�.�޼ҵ��())
    int iv;
    final double Gravity;
    
//	final static double PI = 3.14;
    
    Calc() {
    	this(123.4);
    }
    
    Calc(double Gravity) {
    	this.Gravity = Gravity;
    } //�� �ѹ� �����ڷ� ��� �ʱ�ȭ ����
    
    
    
    static int plus(int a, int b) {
    	return a + b;
    }
    static int min(int a, int b) {
    	return a - b;
    }
}
