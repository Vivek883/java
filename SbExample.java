public class SbExample{
 public static void main(String args[]){
  StringBuffer sb1 = new StringBuffer("indian army");
   System.out.println(sb1); 
   sb1.delete(0,5);
   System.out.println(sb1);
 
 StringBuffer sb2 = new StringBuffer("hello world");
   System.out.println(sb2);
   sb2.delete(0,sb2.length());
   System.out.println(sb2);
 
 StringBuffer sb3 = new StringBuffer("namibia");
   System.out.println(sb3);
   sb3.deleteCharAt(0);
   System.out.println(sb3);
 }
}
 
      