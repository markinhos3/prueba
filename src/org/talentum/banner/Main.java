package org.talentum.banner;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        primera prim = new segunda();
        segunda seg=new segunda();
        prim.imprimir();
        seg.imprimir();


        read();

    }

    private static void read() {
        System.out.println("dame un número: ");

        Scanner out = new Scanner(System.in);

        String x = out.nextLine();

        String y = out.nextLine();

        System.out.println("La cadena es: \n" + "1º: " + x + "\n2º: " + y);
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