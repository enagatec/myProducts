package myProject;

public class dentaku1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int val1 = 0; /* 最初の数字 */
		int val2 = 0; /* 次の数字 */
		String ope; /* 演算子 */
		int kekka; /* 結果を格納 */

		if (args.length != 3) {
			System.out.println("引数は3つ入力してくださいませ");
			System.exit(0); /* プログラムを終了する */
		}

		try {
			val1 = Integer.parseInt(args[0]);
			val2 = Integer.parseInt(args[2]);
		} catch (NumberFormatException e) {
			errDisp("数値でない値が入力されているようですね");
			System.exit(0); /* プログラムを終了する */
		}

		ope = args[1];

		boolean errFlag = true;

		if (ope.equals("kake")) {
			errFlag = false;
		}

		if (ope.equals("waru")) {
			errFlag = false;
		}

		if (ope.equals("tasu")) {
			errFlag = false;
		}

		if (ope.equals("hiku")) {
			errFlag = false;
		}

		if (errFlag == true) {
			errDisp("演算子は kake waru tasu hikuの4つから入力くださいませ");
			System.exit(0); /* プログラムを終了する */
		}

		if (ope.equals("kake")) {
			kekka = val1 * val2;
		} else if (ope.equals("hiku")) {
			kekka = val1 - val2;
		} else if (ope.equals("tasu")) {
			kekka = val1 + val2;
		} else {
			if (val2 == 0) {
				errDisp("0で割ろうとしました");
			}
			kekka = val1 / val2;
		}

		System.out.println("入力された式は " + val1 + " " + ope + " " + val2 + " でございます");
		System.out.println("計算結果は"+kekka+"でございます");
	}
	
	private static void errDisp(String errStr){
		System.out.println("Usage: java dentaku 数値 演算子 数値");
		System.out.println(errStr);
		System.exit(0);	/* プログラムを終了する */
	}
}