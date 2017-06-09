import java.util.*;

class VENDING
{
	public static void main(String[] args) 
	{
		System.out.println("콜라[1000]\t사이다[800]\t커피[600]");
		System.out.println("선택가능한 음료수는 *표시\n\n");
		int money=0;
		System.out.println("돈을 넣어주세요.");
		money = inmoney();
		System.out.println("현재금액은 "+money+"입니다.\n");
		int money2 = 0;

		
		while(money<600){
			System.out.println("추가로 돈을 넣어주세요.");
			money2 = inmoney();
			money=money+money2;
			System.out.println("현재금액은 "+money+"입니다.\n");
		}
		money=menuselect(money);
		
		//추가적인 음료수 뽑기 여부 확인
		
		Scanner sc = new Scanner(System.in); 
		String add = "n";
				
		while(money>=600){
				System.out.println("다른 음료수를 뽑겠습니까?(y/n)");
				add=sc.next();
			
			if(add.equals("y")){
				money=menuselect(money);
				System.out.println("현재금액은 "+money+"입니다.\n");
			}
			else if(add.equals("n"))
				break;
			else{
				System.out.println("값을 입력하세요.");
			}			
		}


		change(money);
		//System.out.println("현재금액은 "+money+"입니다.\n");

	}
	

	public static int inmoney(){
		Scanner sc = new Scanner(System.in); 
        int money = sc.nextInt();
		
		return money;
			
	}

	//메뉴 선택 메소드
	public static int menuselect(int money){
		menuprint(money);
		//System.out.println("마실 음료수를 선택하세요. ( 음료수A=1 , 음료수B=2, 음료수C=3)");
		Scanner sc = new Scanner(System.in);
		int select = sc.nextInt();
		int num;
		switch(select){
			case 1:
				if(money-1000>=0){
					System.out.println("콜라");
					money=money-1000;
				}
				else{
					System.out.println("금액이 모자랍니다.");
				}
				
				break;
			case 2:
				if(money-800>=0){
					System.out.println("사이다");
					money=money-800;
				}
				else{
					System.out.println("금액이 모자랍니다.");
				}
				
				break;
			case 3:
				if(money-600>=0){
					System.out.println("커피");
					money=money-600;
				}
				else{
					System.out.println("금액이 모자랍니다.");
				}
				
				break;
			case 0:
			break;

			default:
				System.out.println("종료");
			break;
		}
		return money;
		


	}
	//메뉴를 출력하는 메소드
	public static int menuprint(int money){
		if (money>=1000)
		{
			System.out.println("*콜라[1000]\t*사이다[800]\t*커피[600]");
			System.out.println("마실 음료수를 선택하세요. ( 콜라=1 , 사이다=2, 커피=3 )");
			return 1;
		}
		else if (money>=800)
		{
			System.out.println("콜라[1000]\t*사이다[800]\t*커피[600]");
			System.out.println("마실 음료수를 선택하세요. ( 콜라=1 , 사이다=2, 커피=3 )");
			return 2;
		}
		else if(money>=600)
		{
			System.out.println("콜라[1000]\t사이다[800]\t*커피[600]");
			System.out.println("마실 음료수를 선택하세요. ( 콜라=1 , 사이다=2, 커피=3 )");
			return 3;
		}
		else
		{
			System.out.println("금액이 모자랍니다.");

			return 4;
		}
		
	}
	//거스름돈 메소드
	public static int change(int money){
		int unit=1000, num, sw=1;
		System.out.print("거스름돈 :");
		while(unit>=100){			
				num=money/unit;
				money=money-unit*num;
				//System.out.println("*"+money);
				if(num!=0){
				System.out.print(unit+"원"+"("+num+")");
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
