package pctask;

//9. feladat: PC illetve Notebook objektumok
public class Main {
	public static void main(String[] args) {
		Computer c1 = new Computer("AMD X6 FX-6100", 3.3, 4096, 1000);
		Computer c2 = new Computer("Intel Core i5-3570K", 3.4, 1024, 500);
		System.out.println("Számítógépek:");
		System.out.println(c1);
		System.out.println("Ez a gép" + (c1.modern()?"":" nem") + " korszerû");
		System.out.println("______________________________________________________________________");
		System.out.println(c2);
		System.out.println("Ez a gép" + (c2.modern()?"":" nem") + " korszerû");
		System.out.println("______________________________________________________________________");
		
		
		Notebook n1 = new Notebook("AMD Turion X2", 1.8, 3072, 250, 3.55);
		Notebook n2 = new Notebook("Intel Atom", 1.6, 1024, 120, 2.2);
		System.out.println("Notebookok:");
		System.out.println(n1);
		System.out.println("Ez a gép" + (n1.modern()?"":" nem") + " korszerû");
		System.out.println("______________________________________________________________________");
		System.out.println(n2);
		System.out.println("Ez a gép" + (n2.modern()?"":" nem") + " korszerû");
		System.out.println("______________________________________________________________________");
		
		//12. feladat:Modern felülírása
		Pda p1 = new Pda("Samsung", 0.4, 512, 64, 3, 125);
		Pda p2 = new Pda("Samsung", 0.3, 512, 64, 3, 100);
		System.out.println("Pda-k:");
		System.out.println(p1);
		System.out.println("Ez a gép" + (p1.modern()?"":" nem") + " korszerû");
		System.out.println("______________________________________________________________________");
		System.out.println(p2);
		System.out.println("Ez a gép" + (p2.modern()?"":" nem") + " korszerû");
	}

}
