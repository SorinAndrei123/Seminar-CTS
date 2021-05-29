package ro.ase.cts.factory;

public class Factory {
	public Jucator getJucator(TipJucator tip, String numeJucator) {
		switch (tip) {
		case Portar: {
			return new Portar(numeJucator);
		}
		case Atacant: {
			return new Atacant(numeJucator);
		}
		case Fundas: {
			return new Fundas(numeJucator);
		}
		default: {
			throw new IllegalArgumentException();
		}

		}

	}
}
