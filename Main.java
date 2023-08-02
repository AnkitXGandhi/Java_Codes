// import java.util.Scanner;

// class Main
// {
//     public static void main(String[] args) {
//         // Scanner input = new Scanner(System.in);
//         // System.out.println("The number is: "+ input.nextInt()); 
    
//     }
// }
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        int n,A[];
        System.out.println("Enter no. of elements:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println("The array elements:");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
}