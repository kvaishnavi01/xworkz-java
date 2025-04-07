package com.xworkz.inheritance;

public class MoleculeAnalyzer {
    public void analyze(Molecule molecule) {
        molecule.bond();
        molecule.vibrate();
        molecule.react();
        molecule.split();
        molecule.combine();

        if (molecule instanceof ProteinMolecule) {
            ProteinMolecule protein = (ProteinMolecule) molecule;
            protein.fold();
        }
    }
}
