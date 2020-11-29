package 数当て11_28;

import java.util.ArrayList;
import java.util.Collections;

public class Pc {

	public static int[] pcAns() {

		//ArrayListを作って数字を代入する
		//(数値をシャッフルするshuffleを使用するため)
		ArrayList<Integer> ansNo =new ArrayList<Integer>();
		for(int i=0; i<10; i++) {
			ansNo.add(i);
		}


		//数値をシャッフルする
		Collections.shuffle(ansNo);


		//シャッフルした数値を配列に必要な桁数だけ代入する
		int [] shuffleAfter = new int[4];
		for(int i=0; i<4; i++) {
			shuffleAfter[i] = ansNo.get(i);
			System.out.print(shuffleAfter[i]);
		}
		System.out.println("");


		//代入した配列を返す
		return shuffleAfter;
	}

}
