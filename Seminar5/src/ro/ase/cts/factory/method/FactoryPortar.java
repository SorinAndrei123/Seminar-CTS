package ro.ase.cts.factory.method;

public class FactoryPortar implements Factory {

	@Override
	public Jucator creeazaJucator(String nume) {
		// TODO Auto-generated method stub
		return new Portar(nume);
	}

}
