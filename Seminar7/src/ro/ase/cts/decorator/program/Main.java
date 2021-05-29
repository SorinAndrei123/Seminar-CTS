package ro.ase.cts.decorator.program;

import ro.ase.cts.decorator.Card;
import ro.ase.cts.decorator.Decorator;
import ro.ase.cts.decorator.DecoratorContactlessTelefon;

public class Main {

	public static void main(String[] args) {
	Card card1=new Card("Ion",3000);
	card1.plataNormala(200);
	card1.plataOnline(100);
	Decorator cardNou=new Decorator(card1);
	cardNou.platesteContactless(400);
	cardNou.plataOnline(100);
	DecoratorContactlessTelefon decoratorContactless=new DecoratorContactlessTelefon(card1);
	decoratorContactless.platesteContactless(300);
	
	
	}

}
