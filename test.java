import java.util.Scanner;
public class test{
    static void insert(int A[],int n){
        for(int i=1;i<n;i++){
            int temp=A[i];    
            int j=i-1;
            while(temp<A[j] && j>=0){
                A[j+1]=A[j];
                j--;
            }
        A[j+1]=temp;
        }
    }       
    public static void main(String args[]) {
        int n;
        System.out.println("enter the numer of element");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int A[]=new int[n];
        System.out.println("Enter Array Elements : ");
        for(int i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }
        // for(i=0;i<n;i++)
        //     System.out.println(A[i]);
        insert(A,n);
        // System.out.println(" ");
        for(int i=0;i<n;i++)
            System.out.println(A[i]);
    }
}
