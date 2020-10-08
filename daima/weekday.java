package youxi;
import java.util.Scanner;
public class weekday {

	public static void main(String[] args) {
		System.out.println("今天是周几？");
		Scanner in = new Scanner(System.in);
		int a=in.nextInt();
		String b=a>=6?"休息":"工作日";
			System.out.println("今天是"+b);

	}

}
