/*Alternate sorting: Given an array of integers, rearrange the array in such a way that the first element is first maximum and second element is first minimum.

    Eg.) Input  : {1, 2, 3, 4, 5, 6, 7}
         Output : {7, 1, 6, 2, 5, 3, 4} 
 */

import java.util.Arrays;
import java.util.Scanner;

public class AlternateSort {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner tj = new Scanner(System.in);

        int a[] = new int[7];
        int b[] = new int[a.length];
        for (int i = 0; i < 7; i++) {
            System.out.print("Enter the a[ " + i + " ] element : ");
            a[i] = tj.nextInt();
        }
        Arrays.sort(a);
        int d = a.length - 1;
        for (int i = 0; i < a.length; i++) {
            b[i] = a[d];
            d--;
            // 7,6,5,4,3,2,1
        }
        for (int k = 0; k < b.length; k++) {
            System.out.print(b[k]);
        }
        System.out.println();
        int c[] = new int[b.length];
        int i = 0;
        for (int j = 0; j < 4; j++) {
            c[i] = b[j];
            i = i + 2;
        }
        int m = 1;
        for (int l = b.length-1; l > 3; l--) {
            c[m] = b[l];
            m = m + 2;
        }

        for (int k = 0; k < c.length; k++) {
            System.out.print(c[k]);
        }

    }
}