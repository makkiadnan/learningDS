import java.util.Scanner;
public class Queries {
    static int[] makeFrequency(int arr[]){
        int frequency[]=new int[100005];
        for(int i=0;i<arr.length;i++){
            frequency[arr[i]]++;
        }
        return frequency;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={5,6,5,400,560,1000,400};
        int frequency[]=makeFrequency(arr);
        System.out.println("enter num of queries: ");
        int q=sc.nextInt();
        while(q>0){
            System.out.println("queries to be searched: ");
            int x=sc.nextInt();
            if(frequency[x]>0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            q--;
        }
    }
    
}
