//Print the sum of every single subarray using carry forward.

public class Program6 {
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6,7};

        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];

                System.out.print(sum+" ");
            }
            System.out.println( );
        }
    }
}
