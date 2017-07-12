package interview;
import java.util.*;
public class KeyisSumofTwoElements {

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
        
        System.out.println("Enter key which is equal to sum of two elements");
        key=s.nextInt();
        int count=0;
        for(int i=0;i<size;i++){
        	for(int j=i+1;j<size;j++){
        		if((a[i]+a[j])==key){
        			System.out.println("Element at position "+i+" and element at positon "+j+" equals "+key);
        		count++;
        		}
        	}
        }
        if(count==0){
        	System.out.println("There are no two elements which give the key upon summation");
        }
        
	}
	
	
}
