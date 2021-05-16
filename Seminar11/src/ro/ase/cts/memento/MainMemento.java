package ro.ase.cts.memento;

public class MainMemento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MeciJucat meciJucat=new MeciJucat("Steaua", "Dinamo", 100, 200, 300, 400);
		System.out.println(meciJucat.toString());
		ManagerMemento managerMemento=new ManagerMemento();
		managerMemento.adaugaMemento(meciJucat.creareMemento());
		meciJucat.setNumeEchipaGazda("Real Madrid");
		meciJucat.setNumeEchipaOaspeti("Barcelona");
		System.out.println(meciJucat.toString());
		meciJucat.setMemento(managerMemento.getLastMemento());
		System.out.println(meciJucat.toString());
		

	}

}
