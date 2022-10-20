import java.util.Scanner;

public class Homework_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        byte[] a=new byte[(n+7)/8];
        for(int i=0;i<n;i++){
            byte t=in.nextBoolean() ? (byte)1 : 0;
            a[i/8]=(byte)(a[i/8] | (t << (i%8)));
        }
        for (int i=0;i<n;i++){
            System.out.print((((a[i/8] & (1 << (i%8))) >> (i%8))==1) + " ");
        }
    }
}
