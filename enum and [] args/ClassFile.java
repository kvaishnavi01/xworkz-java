class Email {
    public static void printingEmail() {
        for (Emails em : Emails.values()) {
            if (em == Emails.ABC_GMAIL) {
                System.out.println("abc@gmail.com");
            }
            if (em == Emails.XYZ_GMAIL) {
                System.out.println("xyz@gmail.com");
            }
            if (em == Emails.QAZ_GMAIL) {
                System.out.println("qaz@gmail.com");
            }
        }
    }
}

class Country {
    public static void Countries() {
        for (Countries ct : Countries.values()) {
            if (ct.name().endsWith("A")) {
                System.out.println(ct);
            }
        }
    }
}

class Alphabet {
    public static void Alphabets() {
        for (Alphabets alp : Alphabets.values()) {
            System.out.print(alp + " ");
        }
        System.out.println();
    }
}

class Food {
    public static String FoodItems(String foodItem) {
        if (foodItem.equals("BROWNIE")) {
            return "Flour, Cocoa Powder, Sugar, Butter";
        } else if (foodItem.equals("PAVBHAJI")) {
            return "Pav, Mashed Vegetables, Butter, Spices";
        } else if (foodItem.equals("MISALPAV")) {
            return "Pav, Sprouts, Farsan, Spicy Curry";
        } else {
            return "Unknown Ingredients";
        }
    }
}