class Lollipop {
    public static void unwrap() { 
        System.out.println("Lollipop is unwrapped."); 
    }

    public static void lick() { 
        System.out.println("Lollipop is being licked."); 
    }

    public static void changeFlavor() { 
        System.out.println("Flavor changed."); 
    }

    public static void checkSize() { 
        System.out.println("Size checked."); 
    }

    public static void checkColor() { 
        System.out.println("Color checked."); 
    }

    public static void isSticky() { 
        System.out.println("Lollipop is sticky."); 
    }

    public static void throwAway() { 
        System.out.println("Lollipop is thrown away."); 
    }

    public static void share() { 
        System.out.println("Lollipop is shared."); 
    }

    public static void checkSugarContent() { 
        System.out.println("Sugar content checked."); 
    }

    public static void melt() { 
        System.out.println("Lollipop is melting."); 
    }

    public static void main(String[] args) {
        unwrap();
        lick();
        changeFlavor();
        checkSize();
        checkColor();
    }
}

class Child {
    public static void main(String[] args) {
        Lollipop.isSticky();
        Lollipop.throwAway();
        Lollipop.share();
        Lollipop.checkSugarContent();
        Lollipop.melt();
    }
}