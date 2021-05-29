package ro.ase.cts.decorator;

public class Card implements CardAbstract {
private String titular;
private int sold;




	public Card(String titular, int sold) {
	super();
	this.titular = titular;
	this.sold = sold;
}
	

	public String getTitular() {
		return titular;
	}


	public int getSold() {
		return sold;
	}
	


	public void setSold(int sold) {
		this.sold = sold;
	}


	@Override
	public void plataOnline(int suma) {
		if(sold>suma) {
			sold-=suma;
			System.out.println("S-a realizat plata online: "+suma);
		}
		

		
	}

	@Override
	public void plataNormala(int suma) {
		if(sold>suma) {
			sold-=suma;
			System.out.println("S-a realizat plata normala: "+suma);
		}
		
		
	}
	
	

}
