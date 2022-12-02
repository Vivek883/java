import java.util.*;
import java.lang.*;
import java.io.*;

class Noarg{
String name;
int id;
Noarg(){
System.out.println("the constructor is called: ");
}
}

class Name{

public static void main(String[] args){
Noarg geek = new Noarg();
System.out.println(geek.name);
System.out.println(geek.id);
}
}

