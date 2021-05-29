package ro.ase.cts.adapter;

public class Bilet {
	private int pret;

	public Bilet(int pret) {
		super();
		this.pret = pret;
	}
	
	public void vinde() {
		System.out.println("s-a vandut biletul cu pretul "+this.pret);
	}
	public void rezerva() {
		System.out.println("s-a rezervat biletul cu pretul " +this.pret);
	}

}
