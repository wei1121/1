package youxi;
import java.util.Scanner;
public class qigai {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a=1;
		int b=in.nextInt();
		int i,j=0;
		for(i=1;i<=b;i++)
		{
			j=j+a;
			a=a*2;
		}
		System.out.println(j);
	}

}
