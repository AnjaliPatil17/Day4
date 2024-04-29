package day5;

public class SumOfThreeInteger {
    public static void main(String[] args) {
        int i,j,k;
        int count=0;
        int arr[]={0,-1,2,-3,1};
        for(i=0;i< arr.length-2;i++){
            for(j=i+1;j<arr.length-1;j++){
                for(k=j+1;k< arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==0){
                        count++;
                        System.out.println("Locations are: "+arr[i]+" "+arr[j]+" "+arr[k]+" ");
                    }
                }
            }
        }
        if(count>0){
            System.out.println("number of disrinct: "+count);
        }else{
            System.out.println("not found");
        }
    }
}
