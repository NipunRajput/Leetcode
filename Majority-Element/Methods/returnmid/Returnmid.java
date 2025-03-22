package returnmid;

import java.util.*;
public class Returnmid{
    public static int maxElement(int arr[]){
        if(arr.length%2==0){
            int mid=arr.length/2;
            return arr[mid];
        }else{
            int mid=arr.length/2+1/2;
            return arr[mid];
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int ans=maxElement(arr);
        System.out.println("Your Ans is this :"+ans);

    }
}