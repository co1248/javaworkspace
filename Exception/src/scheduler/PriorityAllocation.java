package scheduler;

public class PriorityAllocation implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("���� �������� �ٷ� ���� �ص帮�ڽ��ϴ�.");
	}
	@Override
	public void sendCallToAgent() {
		System.out.println("���� �������� ��� �����ϰڽ���.");
	}

}
