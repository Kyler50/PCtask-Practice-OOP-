package pctask;

public class Main {
	public static void main(String[] args) {
		Computer c1 = new Computer("AMD X6 FX-6100", 3.3, 4096, 1000);
		Computer c2 = new Computer("Intel Core i5-3570K", 3.4, 2048, 500);
		System.out.println(c1);
		System.out.println(c2);
	}

}
