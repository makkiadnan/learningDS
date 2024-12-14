public class PracriceArrQ {
    //2nd largest num
    static int largestNum(int arr2[]){
        int max=Integer.MIN_VALUE;
        int n=arr2.length;
        for(int i=0;i<n;i++){
            if(arr2[i]>max){
                max=arr2[i];
            }
        }
        return max;
    }
    static int secondLargestNum(int arr2[]){
        int ans=largestNum(arr2);
        int n=arr2.length;
        for(int i=0;i<n;i++){
            if(arr2[i]==ans){
                arr2[i]=Integer.MIN_VALUE;
            }
        }
        int secondLargestNum=largestNum(arr2);
        return secondLargestNum;
    }        
    //unique num
    static int uniqueNum(int arr1[]){
        for(int i=0;i<arr1.length;i++){
            for(int j=i+1;j<arr1.length;j++){
                if(arr1[i]==arr1[j]){
                    arr1[i]=-1;
                    arr1[j]=-1;
                }
            }
        }
        int ans=-1;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]>0){
                ans=arr1[i];
            }
        }
        return ans;
    }
    //double sum
    static int doubleSum(int arr[],int target){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    count++;
                }
            }
        }
        return count;
    }
    //ist value repeated
    static int istRepeatationNum(int arr3[]){
        int n=arr3.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr3[i]==arr3[j]){
                    return arr3[i];
                }
            }
        }
        return -1;
    }
    static int[] rotateArray(int arr4[],int k){
        int n=arr4.length;
        k=k%n;
        int ans[]=new int[n];
        int j=0;
        //rotated part ist go inside new array start witn n-k
        for(int i=n-k;i<n;i++){
            ans[j++]=arr4[i];
        }
        for(int i=0;i<n-k;i++){
            ans[j++]=arr4[i];
        }
        return ans;   
    }
    static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void reverse(int arr5[],int i,int j){
        if(i<j){
            int temp=arr5[i];
            arr5[i]=arr5[j];
            arr5[j]=temp;
            i++;
            j--;
        }
    }
    static void arrayReverses(int arr5[],int k1){
        int n=arr5.length;
        k1=k1%n;
        reverse(arr5, 0, n-k1-1);
        reverse(arr5, n-k1, n-1);
        reverse(arr5, 0, n-1);
    }
    public static void main(String[] args) {
        //second largest num
        int arr2[]={2,3,4,9,9,8};
        System.out.println("second largest num: "+secondLargestNum(arr2));
        //unique num
        int arr1[]={2,3,3,4,9,9,8,2,4};
        System.out.println("Unique num: "+uniqueNum(arr1));
        //target sum
        int arr[]={3,3,4,9,9,8,2,4}; int target=7;
        System.out.println("num of target sum: "+doubleSum(arr, target));
        //isr repeatation
        int arr3[]={3,3,4,9,9,8,2,4};
        System.out.println("1st element repeated: "+istRepeatationNum(arr3));
        //rotation using an array
        int arr4[]={1,2,3,4,5};
        int k=3;
        int ans[]=rotateArray(arr4,k);
        System.out.print("Rotated Array: ");
        printArray(ans);
        //rotation in place
        int arr5[]={1,2,4,6,8};
        int k1=200;
        System.out.println("Reverse reverse same array: ");
        arrayReverses(arr5, k1);
        printArray(arr5);
        
        



        
    }
    
}
