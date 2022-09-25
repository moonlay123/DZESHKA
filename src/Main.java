import java.util.Locale;
import java.util.Scanner;
import static java.lang.Math.abs;

public class Main {
    static void dz1_1(){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(n%10+n/10%10+n/100);
        System.out.println(n+2-n%2);
    }
    static void dz1_2(){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt(), b=in.nextInt();
        System.out.println(a+b/100 + " " + b%100);
    }
    static void dz1_3(){
        Scanner in =new Scanner(System.in);
        int a=in.nextInt();
        System.out.print(a/3600+":");
        if (a/60%60<10){
            System.out.print("0"+a/60%60+":");
        }
        else{
            System.out.print(a/60%60+":");
        }
        if (a%3600<10){
            System.out.print("0"+a%60);
        }
        else{
            System.out.print(a%60);
        }
    }
    static void dz1_4(){
        Scanner in=new Scanner(System.in).useLocale(Locale.ENGLISH);
        float a=in.nextFloat();
        System.out.println(!(a>=-2 && a<=3 || a<=9 && a>=6));
    }
    static void dz1_5(){
        Scanner in =new Scanner(System.in);
        int a =in.nextInt(),b=in.nextInt(),c=in.nextInt();
        System.out.println(abs(a)>=100 && abs(a)<=999 && a%5==0 && abs(b)>=100 && abs(b)<=999 && b%5==0 || abs(c)>=100 && abs(c)<=999 && c%5==0 && abs(b)>=100 && abs(b)<=999 && b%5==0 || abs(a)>=100 && abs(a)<=999 && a%5==0 && abs(c)>=100 && abs(c)<=999 && c%5==0);
    }
    static void dz1_6(){
        Scanner in =new Scanner(System.in).useLocale(Locale.ENGLISH);
        float x=in.nextFloat(), y=in.nextFloat();
        if (y>=0 && y<=2-x*x || y<0 && y<=2-x*x && y>=x){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    public static void main(String[] args) {
        // My first homework
        // dz1_1();
        // dz1_2();
        // dz1_3();
        // dz1_4();
        // dz1_5();
        // dz1_6();
    }
}