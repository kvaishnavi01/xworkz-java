class RCB {
    public static void playMatch() { 
        System.out.println("Match played."); 
    }

    public static void trainPlayers() { 
        System.out.println("Players trained."); 
    }

    public static void buyPlayer() { 
        System.out.println("Player bought."); 
    }

    public static void sellPlayer() { 
        System.out.println("Player sold."); 
    }

    public static void setStrategy() { 
        System.out.println("Strategy set."); 
    }

    public static void celebrateWin() { 
        System.out.println("Win celebrated."); 
    }

    public static void analyzeLoss() { 
        System.out.println("Loss analyzed."); 
    }

    public static void updateFanBase() { 
        System.out.println("Fan base updated."); 
    }

    public static void organizeEvent() { 
        System.out.println("Event organized."); 
    }

    public static void generateRevenue() { 
        System.out.println("Revenue generated."); 
    }

    public static void main(String[] args) {
        playMatch();
        trainPlayers();
        buyPlayer();
        sellPlayer();
        setStrategy();
    }
}

class IPL {
    public static void main(String[] args) {
        RCB.celebrateWin();
        RCB.analyzeLoss();
        RCB.updateFanBase();
        RCB.organizeEvent();
        RCB.generateRevenue();
    }
}