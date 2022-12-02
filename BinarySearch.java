import java.lang.*;
import java.util.*;
import java.io.*;

public class BinarySearch{
    int binarySearch(int arr[], int l, int r, int x){
      if(r >= 1){
        int mid = (r+l)/2;
      if(arr[mid] == x)
        return mid;
    
      if(arr[mid] > x)
        return binarySearch(arr, l, mid-1, x);

      if(arr[mid]<x)
        return binarySearch(arr, mid+1, r, x);
     }
   return -1;
  }

 public static void main(String[] args){
      BinarySearch ob = new BinarySearch();
      int arr[]={7,3,1,2,8};
      int n=arr.length;
      int x=3;
      int result = ob.binarySearch( arr , 0 , n - 1 , x);
  
  if(result == -1)
      System.out.println("number not found! ");
  else
      System.out.println("the number is found at index: "+result);
   
   }
}

