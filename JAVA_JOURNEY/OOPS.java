 // class and object concept 


 class pen
 {
     String color;
     String type;// ball pen ; gel pen

     public static void write()
     {
         System.out.println("writting something ...");
     }

     public void printColor()
     {
        System.out.println(this.color);
     }
 }

 class Student
 {
    String name;
    int age;

    public  void printINFO()
    {
        System.out.println(this.name);
        System.out.println(this.age);

    }

   //  Student()// constructor
   //  {
   //      System.out.println("constructor student called");
   //  }

   //  Student(String name, int age )
   //  {
   //      this.name=name;
   //      this.age=age;
// 
   //  }
    Student(Student s2)
    {
        this.name=s2.name;
        this.age=s2.age;
    }
    Student()
    {

    }
 }




public class OOPS {

  public static void main(String[] args) {
    pen pen1= new pen();
    pen1.color="blue";
    pen1.type="gel";

    pen1.write();

    pen pen2=new pen();
    pen2.color="black";
    pen2.type="ball-pen";
    
    pen1.printColor();
    pen2.printColor();




    //

    Student s1=new Student();
    
    s1.name = "dudu-pudu";
     s1.age=24;
    // s1.printINFO();

    Student s2=new Student(s1);
    s2.printINFO();



  
  }  
}
