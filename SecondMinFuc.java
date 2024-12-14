public class SecondMinFuc {
    static int finfMin(int arr[]){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    static int secondMin(int arr[]){
        int min=finfMin(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==min){
                arr[i]=Integer.MAX_VALUE;
            }
        }
        int secondMin=finfMin(arr);
        return secondMin;
    }
    public static void main(String[] args) {
        int arr[]={4,6,8,2,5};
        System.out.println(finfMin(arr));
        System.out.println(secondMin(arr));
        
    }

    
}
