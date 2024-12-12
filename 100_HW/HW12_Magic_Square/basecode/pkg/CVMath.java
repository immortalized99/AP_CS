package pkg;

public class CVMath {		
	public static int findMid(int one, int two, int three) {
		return (one + two + three - Math.min(one,Math.min(two,three)) - Math.max(one,Math.max(two,three)));
	}
	
	public static void specialSquare(int num) {
		int numSquares = 0;
		int baseNum = 0;
		int otherNum = 0;
		
		while (true) {
			baseNum += otherNum;
			otherNum++;
			if ((double) (Math.sqrt(baseNum)) % 1 == 0) {
				if (numSquares == num) {
					break;
				}
				numSquares++;
				System.out.println(baseNum);
			}
		}
	}
}











