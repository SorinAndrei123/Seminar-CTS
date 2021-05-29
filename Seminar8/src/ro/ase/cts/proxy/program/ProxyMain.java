package ro.ase.cts.proxy.program;

public class ProxyMain {

	public static void main(String[] args) {
		OperatorRezervari operator=new OperatorRezervari();
		operator.rezerva("Mirel",1);
		ProxyOperatorRezervari proxy=new ProxyOperatorRezervari(operator,4);
		proxy.rezerva("Marcel", 1);
		proxy.rezerva("Dorel", 6);

	}

}
