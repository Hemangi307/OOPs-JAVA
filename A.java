package apack;

public class A {
    public int pubVar;
    protected int protVar;
    private int privVar;

    // Constructor
    public A(int pubVar, int protVar, int privVar) {
        this.pubVar = pubVar;
        this.protVar = protVar;
        this.privVar = privVar;
    }

    // Public method to access private variable
    public int getPrivVar() {
        return privVar;
    }
}