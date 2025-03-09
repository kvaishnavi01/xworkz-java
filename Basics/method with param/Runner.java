//1. Runner.main-->Customer.buy(vegetable,quantity)-->Shop.sell(vegetable,quantity)--> Agent.purchase(vegetable,quantity)-->Broker.brokerage(vegetable,quantity)--> Farmer.farm(vegetable,quantity);

class Runner{
	public static void main(String[] args){
	System.out.println("Main method running");
	Customer.buy("Corn",2);
}
}

class Customer{
	public static void buy(String veg, int quan){
		System.out.println("buy running");
		Shop.sell(veg,quan);
	}
}

class Shop{
	public static void sell(String veg, int quan){
		System.out.println("sell running");
		Agent.purchase(veg,quan);
	}
}

class Agent{
	public static void purchase(String veg, int quan){
		System.out.println("Agent running");
		Broker.brokerage(veg,quan);
	}
}


class Broker{
	public static void brokerage(String veg, int quan){
		System.out.println("Broker running");
		Farmer.farm(veg,quan);
	}
}

class Farmer{
	public static void farm(String veg, int quan){
		System.out.println("the final method values are "+veg+" "+quan);
	} 
}
