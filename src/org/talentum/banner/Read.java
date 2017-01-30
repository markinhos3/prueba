package org.talentum.banner;


import java.util.Scanner;

public class Read {


    private String x;
    private String y;

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    public static void give() {
        System.out.println("Dame 2 cadenas: ");

        Scanner out = new Scanner(System.in);


        String y = out.nextLine();
        String  x = out.nextLine();


        System.out.println("1º: " + y + "\n2º: "+ x);
    }
}

