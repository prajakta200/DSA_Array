public class Program7 {
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6,7};
        int totalsum=0;

        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];

               totalsum+=sum;
            }
            
        }
        System.out.println(totalsum);
    }
}
