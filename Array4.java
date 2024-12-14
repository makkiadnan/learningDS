public class Array4 {
    //swap a ad b wothout using temp variable
    //swap using sum and diffrence 
    static void swap(int a,int b){
       a=a+b;
       b=a-b;
       a=a-b;
       System.out.println("a="+a);
       System.out.println("b="+b);
    }
    //print array fun
    static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    //reverse an array with new array
    static int[] arrayReverse(int arr[]){
        int n=arr.length;
        int ans[]=new int[n];
        int j=0;
        for(int i=n-1;i>=0;i--){
            ans[j++]=arr[i];
        }
        return ans;
    }
    //reverse of an array without using a new aaray same array reverse called inplace reverse
    static void reverseArr(int arrN[]){
        int i=0; int j=arrN.length-1;
        if(i<j){
            int temp=arrN[i];
            arrN[i]=arrN[j];
            arrN[j]=temp;
            i++;
            j--;
        }
    }
    //k times rotated without new array
    static void reverseNewArray(int arr2[],int i,int j){
        while(i<j){
            int temp=arr2[i];
            arr2[i]=arr2[j];
            arr2[j]=temp;
            i++;
            j--;
        }
    }
    static void rotateInPlace(int arr2[],int k){
        int n=arr2.length;
        k=k%n;
        reverseNewArray(arr2,0,n-k-1);
        reverseNewArray(arr2,n-k,n-1);
        reverseNewArray(arr2,0,n-1);
    }
    public static void main(String[] args) {
        int a=5; int b=10;
        swap(a, b);
        int arr[]={1,2,3,4,5,7,89,11,34,56};
        int ans[]=arrayReverse(arr);
        System.out.println("with new array: ");
        printArray(ans);
        int arrN[]={1,2,3,4,5,7,89};
        reverseArr(arrN);
        System.out.println("without new array: ");
        printArray(arrN);
        int arr2[]={1,2,3,4,5,6,7};
        int k=3;
        System.out.println("array rotated without forming new array: ");
        rotateInPlace(arr2, k);
        printArray(arr2);
   
   
   
   
   
   
   
   
    }

    
}
