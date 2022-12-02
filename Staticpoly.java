class Animal{
static void move(){
System.out.println("animals can move");
}
}
class Dog extends Animal{
static void move(){
System.out.println("dogs can move and run");
}
}
class Staticpoly{
public static void main(String args[]){
Animal.move();
Dog.move();
}
}