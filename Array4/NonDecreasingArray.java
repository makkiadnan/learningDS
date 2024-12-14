public class NonDecreasingArray {
    static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void reverseArray(int arr[]){
        int n=arr.length;
        int i=0,j=n-1;
        while (i<j) { 
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--; 
        }
        printArr(arr);
    }
    static int[]  sortSquares(int arr[]){
        int left=0; int right=arr.length-1;
        int ans[]=new int[arr.length];
        int j=0;
        while(left<=right){
            if(Math.abs(arr[left])>Math.abs(arr[right])){
                ans[j++]=arr[left]*arr[left];
                left++;
            }
            else{
                ans[j++]=arr[right]*arr[right];
                right--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={-10,-3,-2,1,4,5};
        int ans[]=sortSquares(arr);
        reverseArray(ans);
        
      
      
        
    }
}
