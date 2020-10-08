package youxi;
import java.util.Scanner;
public class BMI {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入身高(m)：");
		float a=in.nextFloat();
		System.out.println("请输入体重(kg)：");
		float b=in.nextFloat();
		float c=b/(a*a);
		System.out.println("当前的BMI是："+c);

	}

}
