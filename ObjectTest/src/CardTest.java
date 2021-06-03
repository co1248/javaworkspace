
public class CardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card spade1 = new Card("spade", 1);
		Card spade2 = new Card("spade", 2);
		
		Card clover1 = new Card("clover", 1);
		Card clover2 = new Card("clover", 2);
		
		Card diamond1 = new Card("diamond", 1);
		Card diamond2 = new Card("diamond", 2);
		
		Card heart1 = new Card("heart", 1);
		Card heart2 = new Card("heart", 2);
		
		
        System.out.println(spade1.kind);
        System.out.println(spade1.number);
        System.out.println(spade1.height);
        System.out.println(Card.height); //static은 클래스이름으로도 가능해서 구분을 위해 이렇게 쓰면 좋다.
        System.out.println(clover1.height);
	}

}
