package ro.ase.cts.clase;

public abstract class Animal implements Mers {
	private String nume;

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public Animal(String nume) {
		super();
		this.nume = nume;
	}
	

}
