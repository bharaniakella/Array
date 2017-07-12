package interview;
import java.util.*;
public class MajorityElement {

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
        
	MajorityElement me=new MajorityElement();
	me.majority(a, size);
	
	}
	
	public void majority(int a[],int size){
		int maj_index=0;
		int count=1;
		for(int i=1;i<size;i++){
			if(a[i]==a[maj_index]){
			count++;	
			}else
				count--;
			if(count==0){
				maj_index=i;
				count=1;
			}
		}
		
		int candidate=a[maj_index];
		int final_count=0;
		for(int i=0;i<size;i++){
			if(a[i]==candidate){
				final_count++;
			}
		}
		if(final_count>size/2){
			System.out.println("Majority element is "+candidate);
		}else
			System.out.println("Majority element is not present");
		
	}
	
}
