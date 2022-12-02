import java.util.*;
import java.io.*;

public class MetOver{
  static int Add(int a,int b){
    return a+b;
  }
  static int Add(int a,int b,int c){
    return a+b+c;
  }
}
class Testing{
  public static void main(String args[]){
     System.out.println(MetOver.Add(23,53));
     System.out.print(MetOver.Add(34,32,87));
   }
}