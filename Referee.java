package 数当て11_28;

public class Referee {

	public static int[] hint(int [] pc, int[] player) {
		symbol(player[0],pc[0],pc[1],pc[2],pc[3]);
		symbol(player[1],pc[1],pc[0],pc[2],pc[3]);
		symbol(player[2],pc[2],pc[0],pc[1],pc[3]);
		symbol(player[3],pc[3],pc[0],pc[1],pc[2]);
		System.out.println("");
		return pc;
	}

	public static void  symbol(int a,int b,int c,int d,int e) {
		if(a==b) {
			System.out.print("〇");
		}else if (a==c || a == d || a == e) {
			System.out.print("△");
		}else {
			System.out.print("×");
		}
	}
	
	public static void test(int[] a, int[] b) {
		System.out.println("コンピュータ");
		for(int i=0; i<4; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
		System.out.println("人");
		for(int i=0; i<4; i++) {
			System.out.print(b[i]);
		}
	}
}