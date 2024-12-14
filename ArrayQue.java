import java.util.Arrays;
public class ArrayQue {
    //check given array is sorted or not
    static boolean isSorted(int arr4[]){
        boolean ans=true;
        for(int i=1;i<arr4.length;i++){
            if(arr4[i]<arr4[i-1]){
                ans=false;
                break;
            }
        }
        return ans;
    }
    //return array 
    static int[] smallestAndLargest(int arr5[]){
        Arrays.sort(arr5);
        int[]ans={arr5[0],arr5[arr5.length-1]};
        return ans;
    }
    static int strictlyGreaterThan(int arr4[]){
        int count=0;
        for(int i=0;i<arr4.length-1;i++){
            if(arr4[i]<arr4[i+1]){
                count++;   
            }
        }
        return count;
    }
    //check last occurence of an element
    static int lastOccurence(int arr3[],int a){
        int lastidx=-1;
        for(int i=0;i<arr3.length;i++){
            if(arr3[i]==a){
                lastidx=i;      
            }   
        }
        return lastidx;
    }
    public static void main(String[] args) {
        int arr[]={5,6,5,1,5};
        int x=5;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                count++;
            }
        }
        System.out.println(x+" is found "+count+" times");
        int arr3[]={5,6,5,3,5,4};
        int a=5;
        System.out.println(a+" last occurence is idx "+lastOccurence(arr3, a));
        int arr4[]={2,4,5,6,7,8,9};
        System.out.println(strictlyGreaterThan(arr4)+" elements are strictly increasing ");
        int arr5[]={3,1,2,6,8,7,9};
        int ans[]=smallestAndLargest(arr5);
        System.out.println(ans[0]+","+ans[1]);
        System.out.println("is Sorted arr4: "+isSorted(arr4));




    }
    
}
