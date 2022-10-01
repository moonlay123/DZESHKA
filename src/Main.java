import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;
import static java.lang.Math.abs;

public class Main {
    static void dz3_1(){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt(), quqle=in.nextInt();
        String s=new String("");
        while(n>0){
            if (n%10==quqle){
                n/=10;
                continue;
            }
            s=String.valueOf(n%10) +s;
            n/=10;
        }
        System.out.println(s);
    }
    static void dz3_2(){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt(),i=0;
        if (n==0){
            System.out.println(0);
        }
        if (n<0){
            n=-n;
            System.out.print('-');
        }
        while(n>0){
            if ( i==0 && n%10==0 ){
                i=1;
                n/=10;
                continue;
            }
            System.out.print(n%10);
            n/=10;
        }
    }
    static void  dz3_3_mas(){
        Scanner in =new Scanner(System.in);
        int n=in.nextInt(),k=-1;
        int[] v =new int[n];
        for (int i=0;i<n;++i){
            v[i]=in.nextInt();
        }
        for (int q=0;q<n;++q){
            if (k==-1 && v[q]>0){
                k=v[q];
            }
            else if (v[q]>0 && v[q]<k){
                k=v[q];
            }
        }
        System.out.println(k);
    }
    static void dz3_3_without_mas(){
        Scanner in =new Scanner(System.in);
        int n=in.nextInt(),i=-1,z=0;
        for (int q=0;q<n;++q){
            z=in.nextInt();
            if (i==-1 && z>0){
                i=z;
            }
            else if (z>0 && z<i){
                i=z;
            }
        }
        System.out.println(i);
    }
    static void dz3_4_without_mas(){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt(),last=0,z;
        for (int i=0;i<n;i++){
            z=in.nextInt();
            if (i==0){
                last=z;
                continue;
            }
            if (z>last){
                System.out.print(z+" ");
            }
            last=z;
        }
    }
    static void dz3_4_mas(){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt(),last=0;
        int[] v=new int[n];
        for (int i=0;i<n;++i){
            v[i]=in.nextInt();
        for (i=0;i<n;++i){
            if (i==0){
                last=v[i];
                continue;
            }
            if (v[i]>last){
                System.out.print(v[i]+" ");
            }
            last=v[i];
        }
    }
    }
    public static void main(String[] args) {
        //My cringe homework
        //dz3_1();
        //dz3_2();
        //dz3_3_mas();
        //dz3_3_without_mas();
        //dz3_4_without_mas();
        //dz3_4_mas();
    }
}