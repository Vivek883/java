class AnimalSuper{
 String name = "puppy";
  }
class Dog extends AnimalSuper{
 String name = "charlie";
 void printname(){
    System.out.println(name);
    System.out.println(super.name);
 }
}
class Testing{
 public static void main(String args[]){
   Dog d = new Dog();
   d.printname();
 } 
}
