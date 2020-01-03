/**
2. Write a menu driven program to perform the following tasks:
  (
  i) Accept a number and check whether it is a Magic Number or not. A number is said to be magic number
   if the sum of the digits is equal to 1. If the sum of the digits contains more than one digit extract the digits and keep
   finding the sum till it becomes a single digit.
   
   Sample Input: 289 is a Magic Number [289 = 2+8+9 =19 = 1+9 =10 = 1+ 0 = 1]
   55 is a Magic Number [55=5+5=10 = 1+ 0 = 1]
 
   (ii) Accept a number and check whether it is an Automorphic Number or not.
   Sample Input: 25 is an Automorphic number as its square is 625 and 25 is present as the last two digits.
 */


import java.util.*;
public class switch_case_2
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    System.out.println("Enter your choice:\n1 for Magic Number\n2 for Automorphic Number");
    int ch=in.nextInt();
    switch(ch)
    {
     case 1:
     
     System.out.println("Enter a number");
     int n=in.nextInt();
     int num=n,d=0;
     while(n>9)
     {  int s=0;
        d=0;
         while(n!=0)
         {
          d=n%10;
          s=s+d;
          n=n/10;
         }
        n=s;
     }
     if(n==1)
     System.out.println(num+" is a Magic Number.");
     else
     System.out.println(num+" is not a Magic Number.");
     break;
     case 2:
     System.out.println("Enter a number: ");
     int b=in.nextInt();
     int temp=b,a=1;
     int sq=b*b;
     while(temp!=0)
     {
       temp=temp/10;
       a=a*10;
     }
     if (sq%a==b)
     System.out.println(b+" is an Automorphic number.");
     else
     System.out.println(b+" is not an Automorphic number.");
     break;
     default:
     System.out.println("Wrong input");
    }
  }
}

/** Description Table:
 
 *     VARIABLE                            DATA TYPE                         DESCRIPTION 
 
 *       ch                              integer (int)                  - to store the inputted choice.
 *       n                               integer (int)                  - to store the inputted number.
 *      num                              integer (int)                  - to store the number in another variable.
 *       s                               integer (int)                  - to store the sum of digits of the number.
 *       d                               integer (int)                  - to store the extracted last digit of the number.
 *       b                               integer (int)                  - to store the inputted number.
 *      temp                             integer (int)                  - to store the inputted number temporarily.
 *       a                               integer (int)                  - to store multiple of tens with zeroes equal to the number of digits of the square of the number.
 *      sq                               integer (int)                  - to store the square of the number.
 */