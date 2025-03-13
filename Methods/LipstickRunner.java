class LipstickRunner{
	public static void main(String[] args){
		Home.power();
	}
}

class Home{
	public static void power(){
		System.out.println("Power is running inside Home");
		Preetham.useLipstick();
	}
}

class Preetham{
	public static void useLipstick(){
		System.out.println("useLipstick is running inside Preetham called in power");
		Lipstick.apply();
	}
}

class Lipstick{
	public static void apply(){
		System.out.println("apply is running in Lipstick called in Preetham");
		clear();
		
	}
	public static void clear(){
		System.out.println("Invoked within the class");
	}
	
	
}