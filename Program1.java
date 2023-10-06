//Reverse integer

import java.util.*;
class Program1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Input Number :");
        int Input=sc.nextInt();

        int rev=0;
        while(Input!=0){
           int rem=Input%10;

            rev=rev*10+rem;
            Input=Input/10;
        }
        System.out.println("Reverse Number is :"+rev);


     sc.close();

    }
}