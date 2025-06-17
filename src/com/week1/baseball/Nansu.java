package com.week1.baseball;

import java.security.cert.PolicyNode;

public class Nansu {
    int[] com = new int[3];
    public void nanSu(){
        com[0] = (int)(Math.random()*10);
        do{
            com[1] = (int)(Math.random()*10);
        }while (com[0]==com[1]);
        do{
            com[2] = (int)(Math.random()*10);
        }while((com[1]==com[2]) || (com[2]==com[0]));
    }

    public static void main(String[] args) {
        Nansu n = new Nansu();
        for (int i =0;i<10;i++){
            n.nanSu();
            System.out.println(n.com[0]+" "+n.com[1]+" "+n.com[2]);
        }
    }
}
