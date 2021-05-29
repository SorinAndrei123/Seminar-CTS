package ro.ase.cts.flyweight;

public class MainFlyWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rezervare rezervare1=new Rezervare(1,"12:00",2);
		Rezervare rezervare2=new Rezervare(4,"12:30",5);
		Rezervare rezervare3=new Rezervare(3,"12:50",5);
		FlyWeightFactory flyWeightFactory =new FlyWeightFactory();
		Client client1=flyWeightFactory.getClient("0734445");
		client1.printeazaRezervare(rezervare1);
		flyWeightFactory.getClient("44554").printeazaRezervare(rezervare2);
	}

}
