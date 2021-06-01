
public class Hello {

	public static void main(String[] args) {
//                  System.out.println("Hello world!");
                  //한줄주석
                  /*여러줄주석*/
                  //변수의 개념
//                  int age; //변수의 선언
//                  age = 10; //초기화
//                  
//                  System.out.print(age); //가로찍기
                  
//                  int x;
//                  int y;
//                  int z;
//                  
//                  x = 10;
//                  y = 20;
//                  z = 30;
//                  
//                  System.out.println(x); //세로찍기
//                  System.out.println(y);
//                  System.out.println(z);
                  
//                  int x,y,z;
//
//                  
//                  x = 10;
//                  y = 20;
//                  z = 30;
//                  
//                  System.out.println(x); //세로찍기
//                  System.out.println(y);
//                  System.out.println(z);
                  
//                  int x = 10, y = 20, z = 30;
//                  
//                  System.out.println(x); //세로찍기
//                  System.out.println(y);
//                  System.out.println(z);
                  
//                  int x = 10;
//                  int y;
//                  
//                  y = x + 10;
//                  
//                  System.out.println(y);
                  
//                  byte b = 128; //error
                  
//                  char c = 'a'; // "문자열"
//                  System.out.println(c);
//                  
//                  char c2 = 97;
//                  System.out.println(c2);
//                  
//                  char c1 = 'A';
//                  System.out.println(c1);
//                  
//                  int uniCode = c1;
//                  System.out.println(uniCode);
//                  
//                  String str = "a"; //문자열
//                  System.out.println(str);
//                  
//                   byte b = 0;
//                   char c = ' '; //초기값 비워두면 안되고 띄어쓰기 넣어야한다.
//                   String str = null;
//                   String str2 = "";
//                   
//                   byte b = 10;
//                   char c = 10;
//                   short s = 10;
//                   int i = 10; //정수형의 기본타입
//                   long l = 10L; //접미사는 대소문자 상관없음.
//                   
//                   float f = 3.14F; //접미사 f를 필수
//                   double d = 3.14; //실수형이 기본타입
                   
//                   boolean b = true; //false
//                   
//                   if(b) {
//                	   System.out.println(b);
//                   } else {
//                	   System.out.println(b);
//                   }
                   
                   //기본값
//                   byte = 0;
//                   short = 0;
//                   char = 0;
//                   int = 0;
//                   long = 0L;
//                   float = 0.0F;
//                   double = 0.0;
//                   boolean = false;
                    
                   //형변환
                   // --------------------------> 자동형변환
                   //byte < short < int < long < float < double
                      //char      <
                   // 강제(명시적)형변환 <----------------------
                   
//                   int i = 200;
//                   double d = i;
//                   System.out.println(i);
//                   System.out.println(d);
                   
                   int i = 300;
                   byte b = (byte)i; //값의손실
                   System.out.println(i);
                   System.out.println(b);
                   
                   //자동형변환의 조건
                   //1. 변수의 값을 대입 할 때(작은 타입을 큰 타입에 대입할 때)
                   //2. 값을 연산할 때 (+,-)
                   
                   byte b1 = 10;
                   byte b2 = 20;
                   byte result;
                   
                   result = (byte)(b1 + b2); //강제형변환
                   System.out.println(result);
                   //int형보다 작은 정수타입들은 연산시에 자동으로 int형으로 바뀜
                   
                   //int이상의 연산은 큰타입을 쫓아간다.
                   
       }

}