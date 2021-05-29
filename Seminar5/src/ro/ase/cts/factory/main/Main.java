package ro.ase.cts.factory.main;

import ro.ase.cts.factory.Factory;
import ro.ase.cts.factory.Jucator;
import ro.ase.cts.factory.TipJucator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory factory=new Factory();
		Jucator jucator1=factory.getJucator(TipJucator.Portar,"Costel");
		Jucator jucator2=factory.getJucator(TipJucator.Atacant,"Dorel");
		
		System.out.println(jucator1.toString());
		System.out.println(jucator2.toString());
	

	}

}
