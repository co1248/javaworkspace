
public class DataTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data d = new Data();
		d.x = 10;
		d.y = 20;
		System.out.println(d.x + " " + d.y);
		swap(d);
		System.out.println(d.x + " " + d.y);
		
//		System.out.println(d.x);
//		change(d);
//		System.out.println(d.x); //참조형 매개변수
	}
	
//	public static void change(Data z) {
//		z.x = 100; //주소값을 넘겨주기 때문에 원본값이 바뀐다.
//		System.out.println(z.x);
//	}	
	public static void swap(Data r) {
		int temp;
		temp = r.x;
		r.x = r.y;
		r.y = temp;
	}

}
