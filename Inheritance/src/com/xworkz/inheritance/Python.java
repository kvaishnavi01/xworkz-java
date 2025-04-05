package com.xworkz.inheritance;

public class Python extends Language {
    public Python() {
        System.out.println("no args const of Python");
    }

    @Override
    public void compile() {
        System.out.println("Python is interpreted, not compiled");
    }

    @Override
    public void execute() {
        System.out.println("Python executes via the interpreter");
    }

    @Override
    public void syntaxRules() {
        System.out.println("Python uses indentation-based syntax");
    }

    @Override
    public void paradigm() {
        System.out.println("Python supports OOP and functional paradigms");
    }

    @Override
    public void communitySupport() {
        System.out.println("Python has a large open-source community");
    }
}
