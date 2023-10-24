//Total number of Subarrays.

class Program1{
    public static void main(String[] args){
        int arr[]={4,2,10,3,12,-2,15};
        int count=0;

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                count++;
            }
        }
        System.out.println("Total number of Subarrays :"+ count);
    }
}