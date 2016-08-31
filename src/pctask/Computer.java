package pctask;

public class Computer implements Comparable<Computer> {
	private String cpu; // a processzor neve
	private double clockspeed; // a processzor sebess�ge(GHz)
	private int ram; // k�zponti mem�ria m�rete(MB)
	private int hdd; // a merevlemez t�rol�kapacit�sa(GB)
	
	//1. feladat: Konstruktor
	public Computer(String cpu, double clockspeed, int ram, int hdd) {
		this.cpu = cpu;
		this.clockspeed = clockspeed;
		this.ram = ram;
		this.hdd = hdd;
	}

	//2. feladat: Getterek �s Setterek
	public String getCpu() {
		return cpu;
	}


	public void setCpu(String cpu) {
		this.cpu = cpu;
	}


	public double getClockspeed() {
		return clockspeed;
	}


	public void setClockspeed(double clockspeed) {
		this.clockspeed = clockspeed;
	}


	public int getRam() {
		return ram;
	}


	public void setRam(int ram) {
		this.ram = ram;
	}


	public int getHdd() {
		return hdd;
	}


	public void setHdd(int hdd) {
		this.hdd = hdd;
	}

	//3. feladat: toString
	@Override
	public String toString() {
		return 	"Processzor t�pusa: "+cpu+"\r"+
				"Processzor �rajele: "+clockspeed+ "GHz"+"\r"+
				"RAM m�rete: "+ram+ "MB"+"\r"+
				"HDD m�rete: "+hdd+ "GB";
	}

	//4. feladat: equals()
	@Override
	public boolean equals(Object obj) {
		if (obj==null || !(obj instanceof Computer))
		return false;
		
		Computer c = (Computer)obj;
		return (cpu.equals(c.cpu) &&
                Math.abs(clockspeed / c.clockspeed - 1) <= 0.1 &&
                Math.abs(ram / c.ram - 1) <= 0.1 &&
                Math.abs(hdd / c.hdd - 1) <= 0.1);
	}
	
	//5. feladat: compareTo
	public int compareTo(Computer c) {
		return (int) (this.clockspeed = c.clockspeed);
	}
	
	public interface Comparable<T> {
        public int compareTo(T o);
    }
	
	//10. feladat: Modern-e az adott g�p
	public boolean modern(){
		return (clockspeed >= 1.6 && ram >= 2048 && hdd >= 160);
	}
}
