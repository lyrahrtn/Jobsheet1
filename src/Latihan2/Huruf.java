/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan2;

/**
 *
 * @author SMK TELKOM
 */
public class Huruf {    
    public static void main(String[] args) {
        int hi;
        for(hi=0;hi<2;hi++){
            System.out.println("");
        }
        for(int h=0;h<2;h++){
            System.out.print("@@");
            for(int h1=0;h1<4;h1++){
                System.out.print("");
            }
            System.out.println("@@");
        }//h atas
        for(int h2=0;h2<8;h2++){
            System.out.print("@");
        }//h tengah
        System.out.println("");
        for(int h = 0;h<2;h++){
            System.out.print("@@");
            for(int h1=0;h1<4;h1++){
                System.out.print(" ");
            }
            System.out.println("@@");
        }//h bawah
        for(int e=0;e<2;e++){
            System.out.println("");
        }//spasi
        for(int f=0;f<5;f++){
            System.out.print("@");
        }
        System.out.println("");
        for(int ef=0;ef<1;ef++){
            for(int efg=0;efg<2;efg++){
                System.out.print("@");
            }
            System.out.println("");
        }
        for(int f=0;f<5;f++){
            System.out.print("@");
        }
        System.out.println("");
        for(int ef=0;ef<1;ef++){
            for(int efg=0;efg<2;efg++){
                System.out.print("@");
            }
            System.out.println("");
        }
        for(int e=0;e<5;e++){
            System.out.print("@");
        }
        System.out.println("");
        int an;
        for(an=0;an<2;an++){
            System.out.println("");
        }
        int ra;
        int ir;
        for(ra=0;ra<2;ra++){
            System.out.print("@@");
            for(ir=0;ir<ra;ir++){
                System.out.print(" ");
            }
            System.out.println("@@");
        }//r atas
        for(ra=0;ra<3;ra++){
            System.out.print("@@");
            for(ir=0;ir<ra;ir++){
                System.out.print(" ");
            }
            System.out.println("@@");
        }//r bawah
        int sp;
        for(sp=0;sp<2;sp++){
            System.out.println("");
        }
        for(int t = 0; t<7;t++){
            System.out.print("@");
        }
        System.out.println("");
        for(int s = 0;s<4;s++){
            for(sp = 0;sp<3;sp++){
                System.out.print(" ");
            }
            System.out.println("@");
        }
        int a,b;
        for(a=1;a<=5;a++){
            for(b=1;b<=1;b++){
                System.out.print("@");
            }
            System.out.println("");
        }
        int k, l, m, n;
        for(k=1;k<=5;k++){
            for (l=1;l<=1;l++){
                System.out.print("@");
            }
        for(m=2;m<=4;m++){
            if(k==m){
                System.out.print("@");
            }
            else{
                System.out.print(" ");
            }
        }
        for(n=1;n<=1;n++){
            System.out.print("@");
        }
        System.out.println();
        }
    }
}
