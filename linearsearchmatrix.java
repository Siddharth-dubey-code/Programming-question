package JAVA.csepDS;

import java.util.Scanner;

public class linearsearchmatrix {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int r = sc.nextInt();

        System.out.print("Enter columns: ");
        int c = sc.nextInt();

        int[][] a = new int[r][c];

        System.out.println("Enter matrix elements:");
        for(int i = 0; i < r; i++)
            for(int j = 0; j < c; j++)
                a[i][j] = sc.nextInt();

        System.out.print("Enter element to search: ");
        int x = sc.nextInt();

        boolean found = false;

        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                if(a[i][j] == x) {
                    System.out.println("Element found at [" + i + "][" + j + "]");
                    found = true;
                }
            }
        }

        if(!found)
            System.out.println("Element not found"); 
        sc.close(); 
    }
    
}
