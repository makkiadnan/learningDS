public class PointerSwap{
    //even first
    static void  evenOdd(int arr2[]){
        int left=0; int right=arr2.length-1;
        while(left<right){
            if(arr2[left]%2==1 && arr2[right]%2==0){
                swap(arr2, left, right);
                left++;
                right--;
            }
            if(arr2[left]%2==0){
                left++;
            }
            if(arr2[right]%2==1){
                right--;
            }
        }
        printArr(arr2);
    }
    //print fun
    static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    //swap
    static void swap(int arr[],int left,int right){ 
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;   
    }
    static void pointerSwap(int arr[]){
        int left=0; int right=arr.length-1;
        while(left<right){
            if(arr[left]==1 && arr[right]==0){
                swap(arr, left, right);
                left++;
                right--;
            }
            if(arr[left]==0){
                left++;
            }
            if(arr[right]==1){
                right--;
            }  
        }
        printArr(arr);
    }
    public static void main(String[] args) {
        int arr[]={1,1,0,1,1,1,1,0,0,0};
        pointerSwap(arr);
        System.out.println("Welldone Adnan Makki");
        int arr2[]={3,4,5,6,8,1,62};
        evenOdd(arr2);
    }
}