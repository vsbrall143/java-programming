


//write the code here

class Student{

    String Name;
    int roll_no;

    public Student(String Namee,int roll_noo)
    {
        Name=Namee;
        roll_no=roll_noo;

    }
    
    public Student()
    {
        Name="john";
        roll_no=2;
    }
}
// Do not touch the Constructors method
public class Constructors
{
    public static void main(String []args)
    {
        Student obj =new Student();
        Student obj1=new Student("vaibhav",101);
        Student obj2=new Student("rahul",102);
        System.out.println(obj1.Name);
        System.out.println(obj2.Name);
        System.out.println(obj.Name);
        
        
        
        
    }
}




