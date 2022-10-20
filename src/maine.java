import java.util.Scanner;

public class maine {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt(),m=in.nextInt();
        int[][] a=new int[n][m];
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                a[i][j]=i*j;
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
