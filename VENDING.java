import java.util.*;

class VENDING
{
	public static void main(String[] args) 
	{
		System.out.println("�ݶ�[1000]\t���̴�[800]\tĿ��[600]");
		System.out.println("���ð����� ������� *ǥ��\n\n");
		int money=0;
		System.out.println("���� �־��ּ���.");
		money = inmoney();
		System.out.println("����ݾ��� "+money+"�Դϴ�.\n");
		int money2 = 0;

		
		while(money<600){
			System.out.println("�߰��� ���� �־��ּ���.");
			money2 = inmoney();
			money=money+money2;
			System.out.println("����ݾ��� "+money+"�Դϴ�.\n");
		}
		money=menuselect(money);
		
		//�߰����� ����� �̱� ���� Ȯ��
		
		Scanner sc = new Scanner(System.in); 
		String add = "n";
				
		while(money>=600){
				System.out.println("�ٸ� ������� �̰ڽ��ϱ�?(y/n)");
				add=sc.next();
			
			if(add.equals("y")){
				money=menuselect(money);
				System.out.println("����ݾ��� "+money+"�Դϴ�.\n");
			}
			else if(add.equals("n"))
				break;
			else{
				System.out.println("���� �Է��ϼ���.");
			}			
		}


		change(money);
		//System.out.println("����ݾ��� "+money+"�Դϴ�.\n");

	}
	

	public static int inmoney(){
		Scanner sc = new Scanner(System.in); 
        int money = sc.nextInt();
		
		return money;
			
	}

	//�޴� ���� �޼ҵ�
	public static int menuselect(int money){
		menuprint(money);
		//System.out.println("���� ������� �����ϼ���. ( �����A=1 , �����B=2, �����C=3)");
		Scanner sc = new Scanner(System.in);
		int select = sc.nextInt();
		int num;
		switch(select){
			case 1:
				if(money-1000>=0){
					System.out.println("�ݶ�");
					money=money-1000;
				}
				else{
					System.out.println("�ݾ��� ���ڶ��ϴ�.");
				}
				
				break;
			case 2:
				if(money-800>=0){
					System.out.println("���̴�");
					money=money-800;
				}
				else{
					System.out.println("�ݾ��� ���ڶ��ϴ�.");
				}
				
				break;
			case 3:
				if(money-600>=0){
					System.out.println("Ŀ��");
					money=money-600;
				}
				else{
					System.out.println("�ݾ��� ���ڶ��ϴ�.");
				}
				
				break;
			case 0:
			break;

			default:
				System.out.println("����");
			break;
		}
		return money;
		


	}
	//�޴��� ����ϴ� �޼ҵ�
	public static int menuprint(int money){
		if (money>=1000)
		{
			System.out.println("*�ݶ�[1000]\t*���̴�[800]\t*Ŀ��[600]");
			System.out.println("���� ������� �����ϼ���. ( �ݶ�=1 , ���̴�=2, Ŀ��=3 )");
			return 1;
		}
		else if (money>=800)
		{
			System.out.println("�ݶ�[1000]\t*���̴�[800]\t*Ŀ��[600]");
			System.out.println("���� ������� �����ϼ���. ( �ݶ�=1 , ���̴�=2, Ŀ��=3 )");
			return 2;
		}
		else if(money>=600)
		{
			System.out.println("�ݶ�[1000]\t���̴�[800]\t*Ŀ��[600]");
			System.out.println("���� ������� �����ϼ���. ( �ݶ�=1 , ���̴�=2, Ŀ��=3 )");
			return 3;
		}
		else
		{
			System.out.println("�ݾ��� ���ڶ��ϴ�.");

			return 4;
		}
		
	}
	//�Ž����� �޼ҵ�
	public static int change(int money){
		int unit=1000, num, sw=1;
		System.out.print("�Ž����� :");
		while(unit>=100){			
				num=money/unit;
				money=money-unit*num;
				//System.out.println("*"+money);
				if(num!=0){
				System.out.print(unit+"��"+"("+num+")");
				}

				if(sw==1){
					unit=unit/2;
					sw=sw*(-1);
				}
				else{
					unit=unit/5;
					sw=sw*(-1);
				}
		}
		System.out.println();
		return 0;
	}


	
}
