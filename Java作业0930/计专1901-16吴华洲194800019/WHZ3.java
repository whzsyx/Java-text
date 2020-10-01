import java.util.Scanner;
public class WHZ3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数(1-7)");
		int week = sc.nextInt();
		switch (week)
		{
		case 1:
			System.out.println(1+"对应的是星期一。");
			break;
		case 2:
			System.out.println(2+"对应的是星期二。");
			break;
		case 3:
			System.out.println(3+"对应的是星期三。");
			break;
		case 4:
			System.out.println(4+"对应的是星期四。");
			break;
		case 5:
			System.out.println(5+"对应的是星期五。");
			break;
		case 6:
			System.out.println(6+"对应的是星期六。");
			break;
		case 7:
			System.out.println(7+"对应的是星期日。");
			break;
		default :
			System.out.println("输入的数字有误");
		
		}

	}
}