package ro.ase.cts.adapter;

public class AdapterBiletObiecte implements BiletOnline {
private Bilet bilet;
public AdapterBiletObiecte(Bilet bilet) {
	this.bilet=bilet;
}

	@Override
	public void vindeBiletOnline() {
		// TODO Auto-generated method stub
		this.bilet.vinde();
	}

	@Override
	public void rezervaBiletOnline() {
		// TODO Auto-generated method stub
		this.bilet.rezerva();
		
	}

}
