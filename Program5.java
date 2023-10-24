//Print the sum of every single subarray using Prefix sum.

public class Program5 {
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6,7};
        int prefixSum[]=new int[arr.length];
        prefixSum[0]=arr[0];

        for(int i=1;i<arr.length;i++){
            prefixSum[i]=prefixSum[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length;j++){
                int sum=0;
                if(i==0){
                    sum=prefixSum[j];
                }
                else{
                    sum=prefixSum[j]-prefixSum[i-1];
                }
                System.out.print(sum+" ");

            }
            System.out.println( );
           
        }

    }
}
