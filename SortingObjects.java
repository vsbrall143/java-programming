public class SortingObjects {
    
}
import java.util.*;
class Employee
{
    String name;
    int salary;
    Employee(String name,int salary)
    {
        this.name=name;
        this.salary =salary;
    }
}
//do Not change the above code
class Solution
{
   
    public static Employee[] sort_array(Employee arr[],int length)
    {
        /*Function to sort the array in ascending order
        After sorting return the sorted array */
        int n=length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(arr[j].salary>arr[j+1].salary)
                {
                    Employee temp=new Employee("h",0);
                    temp.salary=arr[j].salary;
                    temp.name=arr[j].name;
                    arr[j].salary=arr[j+1].salary;
                    arr[j].name=arr[j+1].name;
                    arr[j+1].salary=temp.salary;
                    arr[j+1].name=temp.name;
                }
            }
        }
        return arr;
 
 
        /* Dont change anything below. If changed click on reset. */
        
    
    }
}
public class Main
{
     public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        Solution s= new Solution();
        int n =Integer.parseInt(sc.nextLine());
        Employee arr[]=new Employee [n];
        for(int i=0;i<n;i++)
        {
            arr[i]=new Employee(sc.nextLine(),Integer.parseInt(sc.nextLine()));
        }
        Employee[] output = s.sort_array(arr, n);
        for(int i=0;i<n;i++)
            System.out.println(output[i].name+" "+output[i].salary);
    }
}