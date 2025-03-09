class FoodItem {
    public static int getPrice(String foodItem) {
        if (foodItem == "Pizza") 
            return 250;
        else if (foodItem == "Burger") 
            return 150;
        else if (foodItem == "Pasta") 
            return 200;
        else if (foodItem == "Sandwich") 
            return 100;
        else if (foodItem == "Biryani") 
            return 300;
        else if (foodItem == "Dosa") 
            return 120;
        else if (foodItem == "Idli") 
            return 80;
        else if (foodItem == "Samosa") 
            return 50;
        else if (foodItem == "Pav Bhaji") 
            return 180;
        else if (foodItem == "Chole Bhature") 
            return 220;
        else if (foodItem == "Paneer Tikka") 
            return 270;
        else if (foodItem == "Dal Makhani") 
            return 250;
        else if (foodItem == "Noodles") 
            return 160;
        else if (foodItem == "Fried Rice") 
            return 180;
        else if (foodItem == "Gulab Jamun") 
            return 100;
        else if (foodItem == "Jalebi") 
            return 90;
        else if (foodItem == "Ice Cream") 
            return 120;
        else if (foodItem == "Tea") 
            return 30;
        else if (foodItem == "Coffee") 
            return 50;
        else 
            return -1;
    }
    
    public static void main(String[] args) {
        System.out.println(getPrice("Pizza"));  
    }
}
