package JAVA.csepDS;
import java.util.Scanner;

public class twoDmatrix {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int m = sc.nextInt();
      int n = sc.nextInt();
      int i;
      int j;
      int arr[][] = new int [m][n];
      for( i=0; i<m; i++){
        for( j=0; j<n; j++){
            arr[i][j] = sc.nextInt();
        }

        }
        for( i=0; i<m; i++){
        for( j=0; j<n; j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
        sc.close();

      }
    }
    
    }
