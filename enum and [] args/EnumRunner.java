class EnumRunner {
    public static void main(String[] args) {
		Email.printingEmail();
		System.out.println("================================");
        Country.Countries();          
		System.out.println("================================");
        Alphabet.Alphabets();       
		System.out.println("================================");
        String ingredients = Food.FoodItems("BROWNIE");
        System.out.println("Ingredients are: " + ingredients);
    }
}