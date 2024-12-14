public class ReverseArray{
    static void printArr(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void reverseArr(int arr[],int i,int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    static void rotateInPlace(int arr[],int k){
        int n=arr.length;
        k=k%n;
        reverseArr(arr, n-k, n-1);
        reverseArr(arr, 0, n-k-1);
        reverseArr(arr, 0, n-1);
    }
    public static void main(String[] args){
        int arr[]={1,2,3,4,5};
        int k=4;
        //reverseArr(arr, 0, arr.length-1);
        rotateInPlace(arr, k);
        printArr(arr);
        
    }
    
}
