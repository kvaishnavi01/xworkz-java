public class Pizza {
    private int price;
    private Boolean veg;
    private int extraCheesePrice=100;
    private int extraToppingAdded=150;
    private int backPack=20;
    private int basePizzaPrice;
    private boolean isExtraCheeseAdded= false;
    private boolean isExtraToppingAdded= false;
    private boolean isBackPackAdded= false;

    public Pizza(Boolean veg) {
        this.veg = veg;
        if(this.veg){
            this.price =300;
        }else{
            this.price=400;
        }
        basePizzaPrice=this.price;
    }
    public void addExtraCheese(){
        isExtraCheeseAdded=true;
        //System.out.println("Extra cheese added");
        this.price += extraCheesePrice;

    }

    public void addExtraToppings(){
        isExtraToppingAdded=true;
        //System.out.println("Extra toppings added");
        this.price += extraToppingAdded;
    }

    public void takeAway(){
        isBackPackAdded=true;
        //System.out.println("opted take away");
        this.price += backPack;
    }

    public void getBill(){
        String bill = "";
        System.out.println("Pizza : "+ basePizzaPrice);
        if(isExtraCheeseAdded){
            bill +="Extra cheese added: "+extraCheesePrice+ "\n";
        }
        if(isExtraToppingAdded){
            bill +="Extra tooping added: "+extraToppingAdded+ "\n";
        }
        if(isBackPackAdded){
            bill +="TakeAway charges: "+backPack+ "\n";
        }
        bill +="Bill " +this.price + "\n";
        System.out.println(bill);
    }
}
