class India{
   void def(){
      System.out.println("india is a democratic republic");
   }
}

class Delhi extends India{
   void pom(){
      System.out.println("delhi is the capital of india");
   }
}

class Kolkata extends Delhi{
    void doc(){
       System.out.println("Kolkata was the first capital of british india");
    }
}

class Testing{
   public static void main(String args[]){
     Kolkata sc = new Kolkata();
     sc.doc();
     sc.pom();
     sc.def();
     }
}