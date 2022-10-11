import java.util.Scanner;

public class homework5 {
    public static void dz5_1(){
        Scanner in =new Scanner(System.in);
        int n=in.nextInt(),m=in.nextInt();
        int[][] a=new int[n][m];
        for (int i=0;i<n*m;i++){
            a[i/m][i%m]=(i/m)*(i%m);
        }
//        for (int i=0;i<n;i++){
//            for (int j=0;j<m;j++){
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println();
//        }
    }
    public static void dz5_2(){
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int q=0,i=n,j=n,b=1;
        int[][] a=new int[2*n+1][2*n+1];
        while (true){
            for(;i>=n-b && i!=-1;i--){
                a[i][j]=q;
                q++;
            }
            if (i==-1 && j==2*n){
                break;
            }
            i++;j--;
            for (;j>=n-b;j--){
                a[i][j]=q;
                q++;
            }
            j++;i++;
            for(;i<=n+b;i++){
                a[i][j]=q;
                q++;
            }
            j++;i--;
            for(;j<=n+b;j++){
                a[i][j]=q;
                q++;
            }
            j--;i--;
            b++;
        }
        for (i=0;i<2*n+1;i++){
            for (j=0;j<2*n+1;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void dz5_3(){
        Scanner in =new Scanner(System.in);
        int n=in.nextInt(),b=0,q=1,i=0,j=0;
        int[][] a=new int[n][n];
        while(true){
            for(;i<n-b-1;i++){
                a[i][j]=q;
                q++;
            }
            for(;j<n-b-1;j++){

                a[i][j]=q;
                q++;
            }
            for(;i>b;i--){
                a[i][j]=q;
                q++;
            }
            for(;j>b;j--) {
                a[i][j] = q;
                q++;
            }
            b++;
            i++;j++;
            System.out.println(i+" "+j);
            if(a[i][j]!=0){
                break;
            }
            if (b==n-1){
                break;
            }
        }
        if (n%2==1){
            a[i-1][j-1]=q;
        }
        for (i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print(a[j][i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // My 101 homework
        // dz5_1();
        // dz5_2();
        // dz5_3();
    }
}
