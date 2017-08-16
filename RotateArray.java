import java.util.Scanner;
public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
int a[]={1,2,3,4,5,6};


for(int i=0;i<a.length;i++){
	System.out.print(a[i]);
}

System.out.println(" ");
int count=0;

System.out.println("How many times do you want to rotate the array?");
int n=scan.nextInt();

while(count<n){
	
	int temp=a[0];
	for(int i=0;i<a.length-1;i++){
		a[i]=a[i+1];
	}
	a[a.length-1]=temp;
	count++;
}

for(int i=0;i<a.length;i++){
	System.out.print(a[i]);
}

	}

}
