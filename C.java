package cpack;

import apack.A;

public class C {

    public void display() {
        A obj = new A(10, 20, 30);

        System.out.println("Inside class C (Object Creation):");
        System.out.println("Public Variable: " + obj.pubVar);

        // Cannot access protected/private directly outside package
        // System.out.println(obj.protVar); ❌
        // System.out.println(obj.privVar); ❌

        System.out.println("Protected Variable: Not Accessible");
        System.out.println("Private Variable: Not Accessible");
    }
}