import java.util.Scanner;

public class NumberDigits {
    public NumberDigits(int a, int b) {
    }

    public static int SumOfSeven(int a, int b){
        int ans=0;
        for (int q=a;q<=b;++q){
            if (q>=10 && q<=99 && q%7==0){
                ans+=q/10+q%10;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt(),b=in.nextInt();
        System.out.println(SumOfSeven(a,b));
    }
}
