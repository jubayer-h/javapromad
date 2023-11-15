package org.example;

public class forloop {

    public static void main(String[] args) {

        for(int i=1; i<2; i++){
            for(int j=1; j<3; j++){
                System.out.println("---hi");

            }
            System.out.println();
        }

        int x ,y ,z ,c;
        c=4;
        x=200;
        y=50;
        z=3;
       int h=x/y+(z*c);
        System.out.println(h);
        System.out.println(Math.pow(3,3));
        System.out.println(Math.addExact(2,3));
        System.out.println(Math.subtractExact(4,3));
    }
}
