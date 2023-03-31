import java.util.*;
import java.util.Collections;

public class SorttheArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        ArrayList<Integer>al=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            al.add(arr[i]);
        }
    //  The elements in ascending order: 
    Collections.sort(al);
    System.out.print("The elements in ascending order:");
    for(Integer e:al)
    {
        System.out.print(e+" ");
    }
    System.out.println();
    // The elements in descending order: 
 
    System.out.print("The elements in descending order:");
    Collections.sort(al,Collections.reverseOrder());
    for(Integer i:al)
    {
        System.out.print(i+" ");
    }


    

        sc.close();
    }
  

   
}
