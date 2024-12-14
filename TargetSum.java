public class TargetSum {
    //Array Manipulation
    static int arrayManipulation(int arr2[]){
        int ans=0;
        for(int i=0;i<arr2.length;i++){
            for(int j=i+1;j<arr2.length;j++){
                if(arr2[i]==arr2[j]){
                    arr2[i]=-1;
                    arr2[j]=-1;
                }  
            }
        }
        for(int i=0;i<arr2.length;i++){
            if(arr2[i]>0){
                ans=arr2[i];
            }
        }
        return ans;
    }
    //for 3 loops
    static int tripleSum(int arr1[],int target){
        int count=0;
        for(int i=0;i<arr1.length;i++){
            for(int j=i+1;j<arr1.length;j++){
                for(int k=j+1;k<arr1.length;k++){
                    int ans=arr1[i]+arr1[j]+arr1[k];
                    if(ans==target){
                        count++;
                    }    
                }
            }
        }
        return count;
    }  
    //for 2 loops 
    static int targetSum(int arr[],int sum){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int ans=arr[i]+arr[j];
                if(ans==sum){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={4,6,3,5,8,2};
        int sum=7;
        System.out.println("Double elements sum: "+targetSum(arr, sum));
        int arr1[]={1,4,5,6,3};
        int target=12; 
        System.out.println("Triple elements sum: "+tripleSum(arr1, target));
        int arr2[]={1,2,3,4,3,2,1,4,5};
        System.out.println("Element not in pair: "+arrayManipulation(arr2));

        
    
    
    
    
    
    
    
    
    }

    
}
