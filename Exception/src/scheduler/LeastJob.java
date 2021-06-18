package scheduler;

public class LeastJob implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("짧은대기열 찾아 연결합니다.");
	}
	@Override
	public void sendCallToAgent() {
		System.out.println("상담전화를 연결합니다.");
	}

}
