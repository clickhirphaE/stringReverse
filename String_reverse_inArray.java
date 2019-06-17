/*Write a program to print a string in reverse:
Eg: Welcome*/
import java.util.*;
public class String_reverse_inArray {
    public static void main(String args[])
    {
       Scanner keyb=new Scanner(System.in);
       int y =0;
        System.out.println("Please Enter the word to be reversed:");
        String xx=keyb.nextLine();
        char arr[] = new char[xx.length()];
       for(int x=xx.length()-1;x>=0;x--)
       {
           arr[y]=xx.charAt(x);
           y++;
       }
        System.out.print("The reversed word is:");
       for(int z=0;z<arr.length;z++){
           System.out.print(arr[z]);

       }
    }
}
