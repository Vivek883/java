import java.util.*;
import java.lang.*;
import java.io.*;

class Paracon{
String name;
int id;
Paracon(String name, int id){
this.name = name;
this.id = id;
}
}

class Name{

public static void main(String[] args){
Paracon geek = new Paracon("hitman",883);
System.out.println("user name: "+geek.name+"\n"+"user id: "+geek.id);
}
}

