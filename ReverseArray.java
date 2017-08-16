
public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[]={1,2,3,4,5,6};
    
    int first=0;
    int last=a.length-1;
    
    for(int i=0;i<a.length;i++){
    	System.out.print(a[i]);
    }
    
    System.out.println("");
    
    while((last-first>0)){
    	int temp=a[first];
    	a[first]=a[last];
    	a[last]=temp;
    	first++;
    	last--;
    }
    
    for(int i=0;i<a.length;i++){
    	System.out.print(a[i]);
    }
    
    
	}

}
