import java.util.Scanner;

public class RotateArray {
    static int[] rotateArray(int arr[],int k){
        int n=arr.length; k=k%n;
        int ans[]=new int[n];
        int j=0;
        for(int i=n-k;i<n;i++){
            ans[j++]=arr[i];
        }
        for(int i=0;i<n-k;i++){
            ans[j++]=arr[i];
        }
        return ans;
    }
    static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of an array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter array numbers: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter value of k: ");
        int k=sc.nextInt();
        //int arr[]={2,3,4,5,8};
       // int k=304;
        int ans[]=rotateArray(arr, k);
        printArray(ans);
    }
    
}
