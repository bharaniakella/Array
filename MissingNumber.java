package interview;
import java.util.*;
public class MissingNumber {

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
        
	MissingNumber m=new MissingNumber();

	int num=m.missing_num(a, size);
	System.out.println("The missing number is "+num);

	
	}
	
	public int missing_num(int a[],int size){
		int x1=a[0];
		for(int i=1;i<size;i++){
			x1=x1^a[i];
		}
		int x2=1;
		for(int i=2;i<size+2;i++){
			x2=x2^i;
		}
		return (x1^x2);
	}
		
}
