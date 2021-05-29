package ro.ase.cts.prototype;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client client1=new Client("Sorin",23);
		Client client2=(Client) client1.copiaza();
		System.out.println(client1);
		System.out.println(client2);
		
		Bilet bilet1=new Bilet(10,"steaua","dinamo","19:30");
		Bilet bilet2=(Bilet) bilet1.copiaza();
		bilet2.setCod(11);
		Bilet bilet3=(Bilet) bilet1.copiaza();
		bilet3.setCod(13);
		System.out.println(bilet1);
		System.out.println(bilet2);
		System.out.println(bilet3);
		

	}

}
