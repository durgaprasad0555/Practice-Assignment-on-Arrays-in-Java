import java.util.*;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("The elements in reverse order -");
        for(int i=n-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
