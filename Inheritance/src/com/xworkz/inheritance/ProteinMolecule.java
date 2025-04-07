package com.xworkz.inheritance;

public class ProteinMolecule extends Molecule {
    public ProteinMolecule() {
        System.out.println("no args const of ProteinMolecule");
    }

    @Override
    public void bond() {
        System.out.println("Protein molecule forms peptide bonds");
    }

    @Override
    public void vibrate() {
        System.out.println("Protein molecule vibrates based on its structure");
    }

    @Override
    public void react() {
        System.out.println("Protein molecule reacts during metabolic processes");
    }

    @Override
    public void split() {
        System.out.println("Protein molecule is split into amino acids");
    }

    @Override
    public void combine() {
        System.out.println("Protein molecule combines to form complex structures");
    }

    public void fold() {
        System.out.println("Protein molecule folds into specific shapes");
    }
}
