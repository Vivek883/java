import java.util.*;
import java.lang.*;
import java.io.*;

class Evenodd
{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter a number");
int num = sc.nextInt();
Evenodd(num);
}
public static void Evenodd(int num){
if(num%2 == 0)
System.out.println(num+" is even");
else
System.out.println(num+" is odd");
}
}
