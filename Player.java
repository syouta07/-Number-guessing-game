package 数当て11_28;

public class Player {

	//最初の文言
	public static void start() {
		System.out.println("4桁の正数の予想をして入力してください");
	}


	//回答の矢印
	public static void display() {
		System.out.print("[入力]>");
	}

	//Playerの入力を配列に入力する
	public static int[] playerAns() {
		int[] no = new int[4];
		String input=new java.util.Scanner(System.in).nextLine();
		boolean unNumber =true;
		for(int i=0; i<input.length(); i++) {
			if(!Character.isDigit(input.charAt(i))) {
				unNumber = false;
			}
		}


		//数列が数字か、また4桁の数字か判定しfalseの場合入力しなおし
		if(input.length()==4 && unNumber==true) {
			for (int i=0; i<no.length; i++) {
				no[i] = Integer.parseInt(input.substring(i,i+1));
			}
		}else if(input.length()!=4 && unNumber==true){
			System.out.println("4桁の数字ではありません\n数字を入力してください\n");
			display();
			playerAns();
		}else if((input.length()==4 && unNumber==false)) {
			System.out.println("4桁ですが数値ではないものが含まれています\n数字を入力してください\n");
			display();
			playerAns();
		}else {
			System.out.println("4桁でなく、数字でないものが含まれています。\n入力しなおしてください\n");
			display();
			playerAns();
		}
		return no;
	}
}
