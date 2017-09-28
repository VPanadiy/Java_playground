package HackerRank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Even_odd_Array {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Even_odd_Array oddArray = new Even_odd_Array();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of the lines :");
        int T = scan.nextInt();
        scan.nextLine();
        String[] arr = new String[T];

        for (int i = 0; i <= T - 1; i++) {
            int num = i + 1;
            System.out.println("Enter the line number " + num + ": ");
            arr[i] = scan.nextLine();
        }
        for (int i = 0; i <= T - 1; i++) {
            System.out.println(oddArray.Even_odd(arr[i]));
        }
    }

    public String Even_odd(String arr) {
        String result;
        char[] charArray = arr.toCharArray();
        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();
        for (int i = 0; i < charArray.length; i = i + 2) {
            even.append(charArray[i]);
        }
        for (int i = 1; i < charArray.length; i = i + 2) {
            odd.append(charArray[i]);
        }
        result = even + " " + odd;
        return result;
    }

}
