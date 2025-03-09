class Atom {
    public static void split() { 
        System.out.println("Atom split."); 
    }

    public static void combine() { 
        System.out.println("Atoms combined."); 
    }

    public static void emitRadiation() { 
        System.out.println("Radiation emitted."); 
    }

    public static void formMolecule() { 
        System.out.println("Molecule formed."); 
    }

    public static void releaseEnergy() { 
        System.out.println("Energy released."); 
    }

    public static void absorbEnergy() { 
        System.out.println("Energy absorbed."); 
    }

    public static void checkStability() { 
        System.out.println("Stability checked."); 
    }

    public static void bondWith() { 
        System.out.println("Bonded with another atom."); 
    }

    public static void decay() { 
        System.out.println("Atom decayed."); 
    }

    public static void ionize() { 
        System.out.println("Atom ionized."); 
    }

    public static void main(String[] args) {
        split();
        combine();
        emitRadiation();
        formMolecule();
        releaseEnergy();
    }
}

class Scientist {
    public static void main(String[] args) {
        Atom.absorbEnergy();
        Atom.checkStability();
        Atom.bondWith();
        Atom.decay();
        Atom.ionize();
    }
}