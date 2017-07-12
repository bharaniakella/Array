package interview;
import java.util.*;
public class OddRepititionElement {

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
        
	OddRepititionElement me=new OddRepititionElement();
	me.oddRepitition(a, size);
	
	}

	public void oddRepitition(int[] a, int size) {
		// TODO Auto-generated method stub
		int result=0;
		for(int i=0;i<size;i++){
			result=result^a[i];
		}
		if(result!=0){
			System.out.println("Element which repeats odd number of times->"+result);
		}else{
			System.out.println("All the elements repeat even number of times");
		}
	}
	
		
}
