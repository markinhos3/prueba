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
        System.out.println("Dame 2 números: ");

        Scanner out = new Scanner(System.in);

        int x = out.nextInt();
        int y = out.nextInt();

        int z = x + y;

        System.out.println("La suma es: " + z);
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