package youxi;
import java.util.Scanner;
public class year {

	public static void main(String[] args) {
		System.out.println("请输入年份");
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		if((a%4==0 && a%100!=0) || a%400==0)
		{
			System.out.println(a+"是闰年");
		}
		else
			System.out.println(a+"不是闰年");

	}

}
