package ro.ase.cts.decorator;

public abstract class DecoratorAbstract implements CardAbstract {
	private Card card;
	

	public DecoratorAbstract(Card card) {
		super();
		this.card = card;
	}

	@Override
	public void plataOnline(int suma) {
		card.plataOnline(suma);
		
	}

	@Override
	public void plataNormala(int suma) {
		card.plataNormala(suma);
		
	}
	
	
	public Card getCard() {
		return card;
	}

	public abstract void platesteContactless(int suma);
		
	

}
