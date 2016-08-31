package pctask;

import java.text.DecimalFormat;

public class Notebook extends Computer {
	double uptime; //a notebook akkumulátorának üzemideje(Óra)
	
	//6. feladat: Notebook class,Konstruktor
	public Notebook(String cpu, double clockspeed, int ram, int hdd, double uptime) {
		super(cpu, clockspeed, ram, hdd);
		this.uptime = uptime;
	}
	
	
	//7. feladat: ram méret megadása
	public Notebook(String cpu, double clockspeed, int hdd, double uptime) {
		super(cpu, clockspeed, 2048, hdd);
		this.uptime = uptime;
	}



	public double getUptime() {
		return uptime;
	}

	public void setUptime(double uptime) {
		this.uptime = uptime;
	}

	//8. feladat: Elözõ toString felülírása
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("##.0");
		return super.toString() + "\r"+ "Üzemidõ: " +  df.format(uptime) +  "óra";
	}
	

}
