package ch12;
import java.util.Scanner;
public class review3 {

	static boolean[] mInputValcheck = {false, false, false};
	static String[] mInputVal = new String[3];
	
	static int mInpyutSeqNo = 0;
	static int mTomSum = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			ShowInputWord();
			
			mInputVal[mInpyutSeqNo] = sc.nextLine();
			if(mInputVal[mInpyutSeqNo]) {
				
			}
		}
	}

}
