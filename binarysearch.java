package JAVA.csepDS;
import java.util.Scanner;

public class binarysearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,9,8,3,4,5};
        int target = 2;
        int low = 0;
        int high = arr.length-1;
        Boolean found = false;
        
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                System.out.println("element found at index" +mid);
                found = true;
                break;      
                  
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            if(!found)
            System.out.println("element not found");
            sc.close();
        }
    }
}
       