package ro.ase.cts.proxy.program;

public class ProxyOperatorRezervari implements IOperatorRezervari {
private OperatorRezervari operator;
private int nrMinimPersoane;


	public ProxyOperatorRezervari(OperatorRezervari operator, int nrMinimPersoane) {
	super();
	this.operator = operator;
	this.nrMinimPersoane=nrMinimPersoane;
}


	@Override
	public void rezerva(String nume, int nrPersoane) {
		if(nrPersoane>=nrMinimPersoane) {
			operator.rezerva(nume, nrPersoane);
		}
		else {
			System.out.println("Veniti direct fara rezervare");
		}
		
		
	}

}
