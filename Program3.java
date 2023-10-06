//Search Insert Position

public class Program3 {
    public static void main(String[] args){
        int arr[]=new int[]{1,3,5,6};
        int N=arr.length;
        int target=5;

        for (int i=0;i<N;i++){
            if(arr[i]==target){
                System.out.println(i);
            }
        }
    }
}
