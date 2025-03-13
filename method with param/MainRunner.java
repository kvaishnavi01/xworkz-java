class MainRunner{
	public static void main(String [] args){
		System.out.println("pickup send from main");
		Courier.pickup("Phone");
	}
}

class Courier{
	public static void pickup(String item){
		System.out.println("calling send from courier");
		Station.send(item);
	}
	
}

class Station{
	public static void send(String item){
		System.out.println("calling accept from station");
		DeliveryGuy.accept(item);
	}
}

class DeliveryGuy{
	public static void accept(String item){
		System.out.println("you are delivering item is a "+item);
	}
	
}