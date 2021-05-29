package ro.ase.cts.factory.method.main;

import ro.ase.cts.factory.method.Factory;
import ro.ase.cts.factory.method.FactoryFundas;
import ro.ase.cts.factory.method.FactoryMijlocas;
import ro.ase.cts.factory.method.FactoryPortar;
import ro.ase.cts.factory.method.Jucator;

public class Main2 {
	static void afisareInfoJucatori(Factory factory,String numeJucator) {
		Jucator jucator=factory.creeazaJucator(numeJucator);
		System.out.println(jucator.toString());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		afisareInfoJucatori(new FactoryPortar(),"Ion");
		afisareInfoJucatori(new FactoryFundas(),"Marcel");
		afisareInfoJucatori(new FactoryMijlocas(),"Dorel");
		

	}

}
