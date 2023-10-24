//Print the sum of every single subarray.

public class Program4 {
    public static void main(String[] args){
        int arr[]=new int[]{1,2,3,4,5,6,7};
        int sum=0;

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<j;k++){
                    sum+=arr[k];
                    System.out.print(sum+" ");
                }
                System.out.println( );
            }
        }
    }
}
