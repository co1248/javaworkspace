
class Q2 {
	public static void main(String[] args) {
		int fahrenheit = 100;
		float celcius = (float)5 / 9  * (fahrenheit - 32);
		celcius = (int)(celcius * 100 + 0.5) / 100F;
		System.out.println("Fahrenheit:" + fahrenheit);
		System.out.println("Celcius:" + celcius);
	}
}
