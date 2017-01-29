package org.talentum.banner;

public class Main {

    public static void main(String[] args) {
        primera prim = new segunda();
        segunda seg=new segunda();
        prim.imprimir();
        seg.imprimir();

    }
}


abstract class primera {
    int x;
    public primera() {
        x = 8;
    }
    public abstract void imprimir();
}
class segunda extends primera {
    public void imprimir() {
        x = 10;
        System.out.println(x + "-");
    }
    public void incrementar() {
        x++;
    }
}