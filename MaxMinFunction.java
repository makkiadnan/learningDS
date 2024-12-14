public class MaxMinFunction {
    //important concept
    static int findMax(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]> max){
                max=arr[i];
            }
        }
        return max;
    }
    static int secondMax(int arr[]){
        int max=findMax(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]== max){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        int secondMax=findMax(arr);
        return secondMax;
    }
    public static void main(String[] args) {
        int arr[]={2,3,5,8,4,1,9,7};
        System.out.println(secondMax(arr));
        
    }
    
}
