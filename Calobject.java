class count_objects
{
    //Write the code here

    static int i=0;
    public count_objects()
    {
        i=i+1;
    }
    
    
}
//Do Not change the Below Main Method


public class Main {
    public static void main(String args[]) {
        count_objects a = new count_objects();
        count_objects b = new count_objects();
        count_objects c = new count_objects();
        System.out.println(a.i);
        count_objects d = new count_objects();
        System.out.println(b.i);
        count_objects e = new count_objects();
        System.out.println(count_objects.i);

    }
}