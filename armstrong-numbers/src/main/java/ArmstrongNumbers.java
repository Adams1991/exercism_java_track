import java.util.ArrayList;
import java.util.LinkedList;

class ArmstrongNumbers {

	boolean isArmstrongNumber(int number) {
		ArrayList<Integer> numberArray = new ArrayList<>();
		int arrayNumber = number;

		while (arrayNumber > 0) {
			numberArray.add(arrayNumber % 10);
			arrayNumber = arrayNumber / 10;
		}

		int comparisonNumber = 0;
		for (int num : numberArray) {
			comparisonNumber += Math.pow(num, numberArray.size());
		}

		if (comparisonNumber == number) {
			return true;
		}
		return false;
	}

}
