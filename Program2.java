//Given an Array of integer and an integer Target,return indices of the numbers such that they add up to target.

public class Program2 {
    public static void main(String[] args){
    
       int arr[]={2,7,11,15};
        int N=arr.length;
        int target=9;
        

        for (int i=0;i<N;i++){
            
            for(int j=i+1;j<N;j++){
              
                if(arr[i]+arr[j]==target){
                  
                    System.out.println(i+","+j);


                   
                }
            }
        }
       
    }
}

