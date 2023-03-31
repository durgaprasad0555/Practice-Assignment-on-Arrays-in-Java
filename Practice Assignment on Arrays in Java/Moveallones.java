import java.util.*;
public class Moveallones {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
      
       int arr[]=new int[n];
       for(int i=0;i<n;i++)
       {
        arr[i]=sc.nextInt();
       }
       ArrayList<Integer>al=new ArrayList<>();
       for(int i=0;i<n;i++)
       {
        if(arr[i]!=1)
        {
            al.add(arr[i]);
        }
       }
       for(int i=0;i<n;i++)
       {
        if(arr[i]==1)
        {
            al.add(arr[i]);
        }
       }
       System.out.print("Array elements after moving Ones to end:");
       for(Integer e:al)
       {
        System.out.print(e+" ");
       }
       sc.close(); 
    }
}
