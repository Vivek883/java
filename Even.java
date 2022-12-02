//even number counting
import java.lang.*;
import java.util.*;

public class Even{
public static void main(String[] args){
int i;
System.out.println("enter a number: ");
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
 if(a >= 2){
    if(a%2 == 0){
     for(i=1;i<=a/2;i++)
      System.out.print(2*i + " ");
    } else{
      for(i=1;i<=(a-1)/2;i++)
       System.out.print(2*i + " ");
    }
  }else{
      System.out.println("invalid choice !");
  }
}
}