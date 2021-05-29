package ro.ase.cts.composite;

public interface Sediu {
	void descriere();
	void adaugaNod(Sediu sediu) throws Exception;
	void stergeNod(Sediu sediu) throws Exception;
	Sediu getSediu(int pozitie) throws Exception;
	

}
