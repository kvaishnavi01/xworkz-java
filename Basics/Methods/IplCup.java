class IplCup {
    public static void designTrophy() { 
        System.out.println("Trophy designed."); 
    }

    public static void engraveWinner() { 
        System.out.println("Winner engraved."); 
    }

    public static void polish() { 
        System.out.println("Trophy polished."); 
    }

    public static void display() { 
        System.out.println("Trophy displayed."); 
    }

    public static void awardToTeam() { 
        System.out.println("Trophy awarded to team."); 
    }

    public static void insure() { 
        System.out.println("Trophy insured."); 
    }

    public static void transport() { 
        System.out.println("Trophy transported."); 
    }

    public static void clean() { 
        System.out.println("Trophy cleaned."); 
    }

    public static void store() { 
        System.out.println("Trophy stored."); 
    }

    public static void celebrateWithFans() { 
        System.out.println("Celebrated with fans."); 
    }

    public static void main(String[] args) {
        designTrophy();
        engraveWinner();
        polish();
        display();
        awardToTeam();
    }
}

class IPL {
    public static void main(String[] args) {
        IplCup.insure();
        IplCup.transport();
        IplCup.clean();
        IplCup.store();
        IplCup.celebrateWithFans();
    }
}