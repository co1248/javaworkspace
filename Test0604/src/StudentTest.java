
public class StudentTest {

	public static void main(String[] args) {
		Student s = new Student();
		s.name = "ȫ�浿";
		s.stclass = 1;
		s.stnumber = 42;
		s.kor = 80;
		s.eng = 60;
		s.math = 100;
		
		System.out.println(s.getTotal());
	}
}
