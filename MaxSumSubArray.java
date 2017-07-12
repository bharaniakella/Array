package interview;
import java.util.*;
public class MaxSumSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size,a[],key;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of array");
        size=s.nextInt();
        a=new int[size];
        
        for(int i=0;i<size;i++){
     	   System.out.println("Enter the element at position "+i);
     	   a[i]=s.nextInt();
        } 
        
	MaxSumSubArray me=new MaxSumSubArray();
	me.maxSuminSubArray(a, size);
	
	}

	public void maxSuminSubArray(int a[],int size){
		
		int max_so_far=a[0];
		int max_count=0;
		int s=0,first=0,last=0;
		for(int i=0;i<size;i++){
			max_count=max_count+a[i];
			if(max_count>max_so_far){
				max_so_far=max_count;
				first=s;
				last=i;
			}
			if(max_count<0){
				max_count=0;
				s=i+1;
			}
		}
		
		System.out.println("The subarray is->");
		for(int i=first;i<=last;i++){
			
			System.out.print(a[i]+" ");
		}
		
		System.out.println("\nThe max value in the subarray is->");
		System.out.println(max_so_far);	
	}
		
}
