import java.util.Scanner;
public class WHZ3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ������(1-7)");
		int week = sc.nextInt();
		switch (week)
		{
		case 1:
			System.out.println(1+"��Ӧ��������һ��");
			break;
		case 2:
			System.out.println(2+"��Ӧ�������ڶ���");
			break;
		case 3:
			System.out.println(3+"��Ӧ������������");
			break;
		case 4:
			System.out.println(4+"��Ӧ���������ġ�");
			break;
		case 5:
			System.out.println(5+"��Ӧ���������塣");
			break;
		case 6:
			System.out.println(6+"��Ӧ������������");
			break;
		case 7:
			System.out.println(7+"��Ӧ���������ա�");
			break;
		default :
			System.out.println("�������������");
		
		}

	}
}