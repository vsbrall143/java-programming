

class Trianglee
{
  int side1,side2,side3;
    //Write the code here
    public Trianglee(int side1,int side2,int side3)
    {
      this.side1=side1;
      this.side2=side2;
      this.side3=side3;
    }

    public int calculate_area()
    {
      return this.side1*this.side2*this.side3;
    }
    public int calculate_perimeter()
    {
      return this.side1+this.side2+this.side3;
    }

    
    
}
//Do Not change the Below Main Method


public class Triangle {
    public static void main(String args[]) {
      Trianglee t=new Trianglee(3,4,5);
      System.out.println(t.calculate_area());
      int per=t.calculate_perimeter();
      System.out.println(per);
      t=new Trianglee(9,10,11);
      System.out.println(t.calculate_area());
      per=t.calculate_perimeter();
      System.out.println(per);
    }
}