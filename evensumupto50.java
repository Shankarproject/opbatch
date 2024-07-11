package startprogram;
import java.util.

*;
 class evensumupto50 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int i=1,n,sum=0;
		System.out.println("enter the value");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
                 {
                  if(n%2==0){
                  sum=sum+i;
                 System.out.println("even");
}
else
System.out.println("odd");
}
}
}
