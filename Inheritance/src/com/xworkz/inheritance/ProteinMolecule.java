package com.xworkz.inheritance;

public class ProteinMolecule extends Molecule {
    public ProteinMolecule() {
        System.out.println("no args const of ProteinMolecule");
    }

    @Override
    public void bond() {
        System.out.println("Protein molecule forms peptide bonds between amino acids");
    }

    @Override
    public void vibrate() {
        System.out.println("Protein vibrates in folded 3D conformations");
    }

    @Override
    public void react() {
        System.out.println("Protein molecule catalyzes biological reactions");
    }

    @Override
    public void absorbEnergy() {
        System.out.println("Protein absorbs thermal or light energy for structural change");
    }

    @Override
    public void move() {
        System.out.println("Protein molecules move within cells via diffusion");
    }
}
