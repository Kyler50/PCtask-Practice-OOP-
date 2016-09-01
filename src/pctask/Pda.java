package pctask;


//11. feladat:Pda osztály létrehozása
public class Pda extends Notebook {
	int weight;//Pda súlya grammban mérve

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
//11. feladat:Pda-t létrehozni
	@Override
	public String toString() {
		return super.toString() + "\r" +  "Pda súlya: " + weight + "gramm";
	}

	@Override
	public boolean modern() {
		return (super.getClockspeed() > 0.3 && super.getRam() >= 128 && super.getHdd() >= 16 && uptime >= 2.5 && weight < 150);
	}
	

}
