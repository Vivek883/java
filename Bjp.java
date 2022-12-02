abstract class India{  
  abstract void run();  
}  
class Bjp extends India{  
void run(){System.out.println("running safely");}  
public static void main(String args[]){  
India obj = new Bjp();  
 obj.run();  
}  
}  