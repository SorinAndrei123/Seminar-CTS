package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	private Zookeeper zookeeper;
	private List<Animal>listaAnimale;
	public Zoo(Zookeeper zookeeper, List<Animal> listaAnimale) {
		super();
		this.zookeeper = zookeeper;
		this.listaAnimale = listaAnimale;
	}
	public Zoo() {
		super();
		this.zookeeper=new Zookeeper("Marcel");
		this.listaAnimale=new ArrayList<>();
		
	}
	public void adaugareAnimal(Animal a) {
		this.listaAnimale.add(a);
		
	}
	public void hranireToateAnimalele() {
		for(Animal a: listaAnimale) {
			this.zookeeper.feed(a);
		}
	}
	public void deplasareAnimale() {
		for(Animal a: listaAnimale) {
			a.merge();
		}
	}
	
	

}
