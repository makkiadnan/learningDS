
import java.util.Arrays;

public class Array {
    void arrFun(){
        int arr[][]={{23,45,6},{3,7,8,9,5,4}};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println("2D Array: "+arr[i][j]+" ");
            }
            //System.out.println();
        }
    }
    static void arr2(){
        int arr2[]={1,5,3};
        int sum=0;
        for(int i=0;i<arr2.length;i++){
            sum +=arr2[i];
        }
        System.out.println("sum of arr2: "+sum);
    }
    //find maximum valye in array
    void maxOfArray(){
        int maxArray[]={3,1,4,6,9,11,21,0,2};
        int ans=0;
        for(int i=0;i<maxArray.length;i++){
            if(maxArray[i]>ans){
                ans=maxArray[i];
            }
        }
        System.out.println("Max value: "+ans);  
    }
    //find X at idx
    void arrayIdx(){
        int array[]={3,1,4,6,9,4,11,21,4,0,2};
        int X=4;
        int ans=-1;
        for(int i=0;i<array.length;i++){
            if(array[i]==X){
                ans=i;
                break;
            }
        } 
        if(ans==-1){
            System.out.println("not found");
        }
        else{
            System.out.println(X+" found at idx: "+ans);
        }
    }
    public static void main(String[] args) {
        Array obj=new Array();
        obj.arrFun();
        arr2();
        obj.maxOfArray();
        obj.arrayIdx();
       // int a=5;
       // int b=a;
       // System.out.println(a);
       //   System.out.println(--b);
       int arr[]=new int[4];
       arr[0]=3;
       arr[1]=5;
       arr[2]=7;
       arr[3]=9;
       //use defined copyfunction
       int arr2[]=Arrays.copyOfRange(arr,0,arr.length);
       //arr2[0]=0;
       //arr2[1]=0;
       System.out.println("copied array: ");
       for(int i=0;i<arr2.length;i++){
          System.out.print(arr2[i]+" ");
       }
       System.out.println();
       System.out.println("original array: ");
       for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
       }
    }


    
}
