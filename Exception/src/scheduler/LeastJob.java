package scheduler;

public class LeastJob implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("ª����⿭ ã�� �����մϴ�.");
	}
	@Override
	public void sendCallToAgent() {
		System.out.println("�����ȭ�� �����մϴ�.");
	}

}
