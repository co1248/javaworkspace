package scheduler;

import java.util.Scanner;

public class SchedulerTest {

	public static void main(String[] args) {
		System.out.println("상담 연결 방법을 정하세요.");
		System.out.println("L : 짧은대기열 찾아 연결합니다.");
		System.out.println("P : 우선순위에 따라 연결합니다.");
		System.out.println("R : 연결순서대로 연결합니다.");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		Scheduler sch = null;
		if(s.equalsIgnoreCase("L")) { //대소문자 구분안하고 같은지 비교
			sch = new LeastJob();
		} else if(s.equalsIgnoreCase("P")) {
	        sch = new PriorityAllocation();
		} else if(s.equalsIgnoreCase("R")) {
	    	sch = new RoundRobin();
		}// else {
//			System.out.println("잘못입력하셨습니다. 다시 걸어주시기바랍니다.");
//		}
		sch.getNextCall();
		sch.sendCallToAgent();
	}
}
