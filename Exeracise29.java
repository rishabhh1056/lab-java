/*Write a Java program to convert a hexadecimal number into a binary number.
Input Data:
Enter Hexadecimal Number : 37
Expected Output

Equivalent Binary Number is: 110111 */

import java.util.Scanner;
public class Exeracise29 {
     public static int hex_to_decimal(String s)
    {
             String digits = "0123456789ABCDEF";
             s = s.toUpperCase();
             int val = 0;
             for (int i = 0; i < s.length(); i++)
             {
                 char c = s.charAt(i);
                 int d = digits.indexOf(c);
                 val = 16*val + d;
             }
             return val;
    }
    public static void main(String args[])
    {
        String hexdec_num;
        int dec_num, i=1, j;
        int bin_num[] = new int[100];
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter Hexadecimal Number : ");
            hexdec_num = scan.nextLine();
        }
		
        /* convert hexadecimal to decimal */        
        dec_num = hex_to_decimal(hexdec_num);
        
        /* convert decimal to binary */        
        while(dec_num != 0)
        {
            bin_num[i++] = dec_num%2;
            dec_num = dec_num/2;
        }
		
        System.out.print("Equivalent Binary Number is: ");
        for(j=i-1; j>0; j--)
        {
            System.out.print(bin_num[j]);
        }
        System.out.print("\n");
    }
}