package dpack;

import bpack.B;
import cpack.C;

public class ProtectedDemo {

    public static void main(String[] args) {

        System.out.println("Name: Hemangi Chavda");
        System.out.println("Enrollment Number: 240390107011\n");

        B bObj = new B(100, 200, 300);
        C cObj = new C();

        bObj.display();
        System.out.println();
        cObj.display();
    }
}