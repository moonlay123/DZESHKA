import java.util.Scanner;

public class MyArrays {
    public static int MinToBegin(int[] a){
        int min=a[0],q=0,now=a[0],t;
        for (int i=1;i<a.length;i++){
            if (a[i]<min){
                min=a[i];
                q=i;
            }
        }
        for (int i=0;i<a.length-1;i++){
            if (i==q-1){
                a[0]=min;
                a[i+1]=now;
            }
            else if(i<q-1){
                t=a[i+1];
                a[i+1]=now;
                now=t;
            }

        }
        return 0;
    }
    public static double AvgOf4Digit(int[] a){
        double ans=0;
        int q=0;
        for (int i=0;i<a.length;i++){
            if (a[i]/1000!=0 && a[i]/10000==0){
                ans+=a[i];
                q++;
            }
        }
        if (ans==0){
            return -1;
        }
        return ans/q;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
         int n=in.nextInt();
         if (n!=0) {
             int[] a = new int[10001];
             for (int i = 0; i < a.length; i++) {
                 if (i < n) {
                     a[i] = in.nextInt();
                 } else {
                     a[i] = a[0];
                 }
             }
//             MinToBegin(a);
//             for (int i=0;i<n;i++){
//                 System.out.print(a[i]+" ");
//             }
//             System.out.println(AvgOf4Digit(a));
         }
         else{
             System.out.println(-1);
         }

    }
}
