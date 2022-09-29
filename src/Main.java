import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;
import static java.lang.Math.abs;

public class Main {
    static void dz2_1(){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt(), fn1=1, fn2=1;
        for (int i=0;i<n-2;i++){
            fn2+=fn1;
            fn1=fn2-fn1;
        }
        System.out.println(fn2);
    }
    static void dz2_2(){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        long krol=11, volk=2, syed=0;
        for (int i=1;i<=n;++i){
            if(i%2==1){
                krol*=3;
            }
            else{
                if (krol<volk*10){
                    volk=krol/10;
                }
                else{
                    krol-=volk*10;
                }
                syed+=volk*10;
            }
            if (syed>=70){
                volk+=syed/70;
                syed%=70;
            }
            if (krol>19000000){
                System.out.println("Слишком много кролей");
                break;
            }
        }
        System.out.println(krol+" "+volk);
    }
    static void dz2_3(){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String ans=String.valueOf(n);
        if (n>=11 && n<=20){
            ans+=" TORTOV";
        }
        else {
            switch (n % 10) {
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 0:
                    ans += " TORTOV";
                    break;
                case 1:
                    ans+=" TORT";
                    break;
                case 3:
                case 4:
                case 2:
                    ans+=" TORTA";
                    break;
            }
        }
        System.out.println(ans);
    }
    static void dz2_4(){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt(), min=9;
        while (n>0 && min!=1){
            if (n%10<min && n%10!=0) {
                min = n % 10;
            }
            n/=10;
        }
        System.out.println(min);
    }
    public static void main(String[] args) {
        //My second homework
        //dz2_1();
        //dz2_2();
        //dz2_3();
        //dz2_4();
    }
}