package scheduler;

public class RoundRobin implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("���������� �����մϴ�.");
	}
	@Override
	public void sendCallToAgent() {
		System.out.println("�����ȭ�� �����մϴ�.");
	}
	
}
