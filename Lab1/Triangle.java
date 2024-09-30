import java.util.*;
public class Triangle {
public static void main(String arg[]){
	Scanner in = new Scanner(System.in);
	System.out.println("nhap n: ");
	int n = in.nextInt();
	StringBuilder st = new StringBuilder("*");
	
	for(int i=1;i <= n; i++)
	{   for (int k = n-1-i;k>=0;k--) System.out.print(" ");
		System.out.println(st.toString());
		st.append("**");
	}



} 

}