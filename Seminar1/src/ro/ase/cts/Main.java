package ro.ase.cts;

import ro.ase.cts.clase.Animal;
import ro.ase.cts.clase.Girafa;
import ro.ase.cts.clase.Zebra;
import ro.ase.cts.clase.Zoo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Zoo zoo=new Zoo();
		Animal a=new Zebra("Marcel");
		Animal b=new Zebra("Claudia");
		Girafa g1=new Girafa("girafa1",400);
		Girafa g2=new Girafa("girafa2",500);
		
		zoo.adaugareAnimal(a);
		zoo.adaugareAnimal(b);
		zoo.adaugareAnimal(g1);
		zoo.adaugareAnimal(g2);
		zoo.hranireToateAnimalele();
		zoo.deplasareAnimale();
	
		

	}

}
