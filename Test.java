import  java.util.*;
import java.lang.*;

interface Cse{
void future();
}
interface Ece{
void career();
}
class Test implements Cse,Ece{
public void future(){
System.out.println("future is electronics");
}
public void career(){
System.out.println("qualcomm");
}
public static void main(String Args[]){
Test s = new Test();
s.future();
s.career();
}
}