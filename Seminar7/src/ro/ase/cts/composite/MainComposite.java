package ro.ase.cts.composite;

public class MainComposite {
	public static void main(String[]args) throws Exception {
		Agentie a1=new Agentie("a1");
		Agentie a2=new Agentie("a2");
		Filiala f1=new Filiala("f1");
		Filiala f2=new Filiala("f2");
		Filiala f3=new Filiala("f3");
		a1.adaugaNod(f1);
		a2.adaugaNod(f2);
		a2.adaugaNod(f3);
		a1.adaugaNod(a2);
		a1.descriere();
		
	}

}
