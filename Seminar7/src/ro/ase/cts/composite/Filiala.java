package ro.ase.cts.composite;

public class Filiala implements Sediu {
	private String nume;
	

	public Filiala(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void descriere() {
		// TODO Auto-generated method stub
		System.out.println("Filiala "+nume);
		
	}

	@Override
	public void adaugaNod(Sediu sediu)throws Exception {
		// TODO Auto-generated method stub
		throw new Exception();
		
	}


	@Override
	public void stergeNod(Sediu sediu) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Sediu getSediu(int pozitie) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	

}
