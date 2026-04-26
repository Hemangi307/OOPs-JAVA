package bpack;

import apack.A;

public class B extends A {

    public B(int pubVar, int protVar, int privVar) {
        super(pubVar, protVar, privVar);
    }

    public void display() {
        System.out.println("Inside class B (Inheritance):");
        System.out.println("Public Variable: " + pubVar);
        System.out.println("Protected Variable: " + protVar);

        // Cannot access private variable directly
        // System.out.println(privVar); ❌
        System.out.println("Private Variable: Not Accessible");
    }
}