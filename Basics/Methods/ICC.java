class ICC {
    public static void organizeTournament() { 
        System.out.println("Tournament organized."); 
    }

    public static void setRules() { 
        System.out.println("Rules set."); 
    }

    public static void rankTeams() { 
        System.out.println("Teams ranked."); 
    }

    public static void banPlayer() { 
        System.out.println("Player banned."); 
    }

    public static void awardPlayer() { 
        System.out.println("Player awarded."); 
    }

    public static void scheduleMatches() { 
        System.out.println("Matches scheduled."); 
    }

    public static void updateRankings() { 
        System.out.println("Rankings updated."); 
    }

    public static void conductAntiDopingTests() { 
        System.out.println("Anti-doping tests conducted."); 
    }

    public static void promoteCricket() { 
        System.out.println("Cricket promoted."); 
    }

    public static void resolveDisputes() { 
        System.out.println("Disputes resolved."); 
    }

    public static void main(String[] args) {
        organizeTournament();
        setRules();
        rankTeams();
        banPlayer();
        awardPlayer();
    }
}

class CricketTeam {
    public static void main(String[] args) {
        ICC.scheduleMatches();
        ICC.updateRankings();
        ICC.conductAntiDopingTests();
        ICC.promoteCricket();
        ICC.resolveDisputes();
    }
}