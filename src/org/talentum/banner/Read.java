package org.talentum.banner;


import java.util.Scanner;

public class Read {

    public static void read(){

        System.out.println("Dame 2 números: ");

        Scanner out = new Scanner(System.in);

        int x = out.nextInt();
        int y = out.nextInt();

        int z = x + y;

        System.out.println("La suma es: " + z);
    }

}

