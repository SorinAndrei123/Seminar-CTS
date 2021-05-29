package ro.ase.cts.proxy.program;

public class OperatorRezervari implements IOperatorRezervari {

	
	@Override
	public void rezerva(String numeClient, int nrPersoane) {
		System.out.println("Persoana "+numeClient +" a facut rezervare.Nr persoane: " +nrPersoane);
		
	}

}
