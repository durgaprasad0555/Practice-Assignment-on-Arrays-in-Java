import java.util.*;
public class Findcma
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        //The element with the Minimum value
        int min=arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i]<min){
                min=arr[i];
            }

        }
        System.out.println("The element with the Minimum value:"+min);
        // The element with the Maximum value
        int max=arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("The element with the Maximum value:"+max);
        // Average of all array elements
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i];
        }
        int ans=sum/n;
        System.out.println(" Average of all array elements:"+ans);
        // Total number of array elements
        int cnt=0;
        for(int i=0;i<n;i++)
        {
           cnt++;
        }
        System.out.println("Total number of array elements:"+cnt);
        sc.close();




    }
}