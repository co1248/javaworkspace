package scheduler;

public class RoundRobin implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("연결순서대로 연결합니다.");
	}
	@Override
	public void sendCallToAgent() {
		System.out.println("상담전화를 연결합니다.");
	}
	
}
