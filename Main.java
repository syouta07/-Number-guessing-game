package 数当て11_28;

public class Main {

	public static void main(String[] args) {

		int count = 0;
		boolean corect = false;
		//コンピューターの答えを生成し、1桁づつ配列に格納する
		int[] pc = Pc.pcAns();

		//playerに回答してもらう指示をだす
		Player.start();

		//回答枠をだす
		Player.display();

		//Playerに回答してもらい、一文ずつ配列に格納する
		int[] player = Player.playerAns();

		pc =Referee.hint(pc,player);


		//2回目の回答ループ
		while(!corect) {
			count++;
			if(pc[0]==player[0] && pc[1]==player[1] && pc[2]==player[2] && pc[3]==player[3]) {
				System.out.println("正解です‼あなたは"+count+"目で正解しました‼");
				if(count<=4) {
					System.out.println("素晴らしい成績ですね‼");
					break;
				}else if(count<=6){
					System.out.println("なかなかやりますね");
					break;
				}else {
					System.out.println("もう少し修業が必要ですね");
					break;
				}
			}else {
				//pcとPlayerの回答を判定し、〇△×を出力
				Player.display();
				player = Player.playerAns();
				Referee.hint(pc,player);
			}
		}
	}

}
