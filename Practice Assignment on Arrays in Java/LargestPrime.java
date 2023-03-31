import java.util.*;
public class LargestPrime {
    public static boolean isprime(int n) {
        if (n <= 1) {
            return false;
        }
        int k=(int)Math.sqrt(n);
        for (int i = 2; i < k; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int largeprime(int[] arr,int n) {
        int largeprime= arr[0];
        for (int i = 1; i < n; i++) {
            if (isprime(arr[i]) && arr[i] > largeprime) {
                largeprime = arr[i];
            }
        }
        return largeprime;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int largeprime = largeprime(arr,n);
        if (largeprime == -1) {
            System.out.println("There are no prime numbers ");
        } else {
            System.out.println(" The Largest Prime number in given array:" + largeprime);
        }
        sc.close();
    }
}
