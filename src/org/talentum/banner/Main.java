package org.talentum.banner;

import java.util.Scanner;

import static sun.misc.Version.print;


public class Main {

    public static void main(String[] args) {
        primera prim = new segunda();
        segunda seg = new segunda();
        prim.imprimir();
        seg.imprimir();

        Read ob = new Read();

        ob.setX("Hola cara");
        ob.setY("cola de mar");

        System.out.println("RESULTA: \n" + "\n1º: " + ob.getX() + "\n2º: " + ob.getY());

        ob.give();
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