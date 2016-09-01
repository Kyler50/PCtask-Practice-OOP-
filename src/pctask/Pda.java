package pctask;


//11. feladat:Pda oszt�ly l�trehoz�sa
public class Pda extends Notebook {
	int weight;//Pda s�lya grammban m�rve

	public Pda(String cpu, double clockspeed, int ram, int hdd, double uptime, int weight) {
		super(cpu, clockspeed, ram, hdd, uptime);
		this.weight = weight;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
//11. feladat:Pda-t l�trehozni
	@Override
	public String toString() {
		return super.toString() + "\r" +  "Pda s�lya: " + weight + "gramm";
	}

	@Override
	public boolean modern() {
		return (super.getClockspeed() > 0.3 && super.getRam() >= 128 && super.getHdd() >= 16 && uptime >= 2.5 && weight < 150);
	}
	

}
