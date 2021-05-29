package ro.ase.cts.facade;

public class MainFacade {

	public static void main(String[] args) {
		Persoana persoana=new Persoana("Dorel","1993405489573");
		if(persoana.getVarsta()>=18) {
			if(!Politie.esteUrmarit(persoana)) {
				BirouDeCredite birouDeCredite=new BirouDeCredite();
				if(!birouDeCredite.areCredite(persoana)) {
					System.out.println("S-a creat contul");
				}
						
			}
		}
		Persoana persoana2=new Persoana("Marian","1993405489573");
		if (VerificarePersoana.verificarePersoana(persoana2)) {
			System.out.println("Cont creat pentru " + persoana2.getNume());
		}
		else {
			System.out.println("Nu se poate crea contul pentru " + persoana2.getNume());
		}

	}

}
