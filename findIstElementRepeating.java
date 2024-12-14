public class findIstElementRepeating{
    //ist num repeating
    static int istElementRepeating(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return arr[i];                  
                }
            }
        }
        return -1;
    }
     //last num repeating
     static int lastElementRepeating(int arr[]){
        int ans=-1;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    ans=arr[i];                  
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,5,3,4,6,3,6,3,4,6};
        System.out.println("Ist element repeated: "+istElementRepeating(arr));
        System.out.println("Last element repeated: "+lastElementRepeating(arr));


        
    }
}