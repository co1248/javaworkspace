package scheduler;

import java.util.Scanner;

public class SchedulerTest {

	public static void main(String[] args) {
		System.out.println("��� ���� ����� ���ϼ���.");
		System.out.println("L : ª����⿭ ã�� �����մϴ�.");
		System.out.println("P : �켱������ ���� �����մϴ�.");
		System.out.println("R : ���������� �����մϴ�.");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		Scheduler sch = null;
		if(s.equalsIgnoreCase("L")) { //��ҹ��� ���о��ϰ� ������ ��
			sch = new LeastJob();
		} else if(s.equalsIgnoreCase("P")) {
	        sch = new PriorityAllocation();
		} else if(s.equalsIgnoreCase("R")) {
	    	sch = new RoundRobin();
		}// else {
//			System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �ɾ��ֽñ�ٶ��ϴ�.");
//		}
		sch.getNextCall();
		sch.sendCallToAgent();
	}
}
