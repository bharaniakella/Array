import java.util.Scanner;
public class WaveSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the number of elements in array->");
int n=s.nextInt();

int a[]=new int[n];
System.out.println("Enter the elements");
for(int i=0;i<n;i++){
	a[i]=s.nextInt();
}

System.out.println("Initial array elements");
for(int i=0;i<n;i++){
	System.out.print(a[i]+" ");
}

WaveSort obj=new WaveSort();
a=obj.wave(a, n);

System.out.println("After wave sort->");
for(int i=0;i<n;i++){
	System.out.print(a[i]+" ");
}


	}
	
	public int[] wave(int a[],int n){
		for(int i=0;i<n-1;i++){
			if(i%2==0){
				if(!(a[i]>a[i+1])){
					int temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
			}else{
				if(!(a[i]<a[i+1])){
					int temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
			}
		}
		return a;
	}

}
