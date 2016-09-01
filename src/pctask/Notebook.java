package pctask;

import java.text.DecimalFormat;

public class Notebook extends Computer {
	double uptime; //a notebook akkumul�tor�nak �zemideje(�ra)
	
	//6. feladat: Notebook class,Konstruktor
	public Notebook(String cpu, double clockspeed, int ram, int hdd, double uptime) {
		super(cpu, clockspeed, ram, hdd);
		this.uptime = uptime;
	}
	
	
	//7. feladat: ram m�ret megad�sa
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

	//8. feladat: El�z� toString fel�l�r�sa
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("##.0");
		return super.toString() + "\r"+ "�zemid�: " +  df.format(uptime) +  "�ra";
	}


	@Override
	public boolean modern() {
		return (super.getClockspeed() > 1.0 && super.getRam() >= 1024 && super.getHdd() >= 120 && uptime >= 3.0);
	}
	
	

}
