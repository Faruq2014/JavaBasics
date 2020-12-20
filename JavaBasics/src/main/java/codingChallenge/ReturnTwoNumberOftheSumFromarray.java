package codingChallenge;

import java.util.HashMap;
import java.util.Map;

public class ReturnTwoNumberOftheSumFromarray {

	public static void main(String[] args) {
		// in this given array which of the two array's sum is 5(target). print their index number.
		int[] num=new int[] {2,3,4,5,7};
		int target=5;
		int[] result=getTwoNumbers(num,target);
		System.out.println(result[1]+", "+result[0]);
	}
public static int[]getTwoNumbers(int[]numbers, int target){
	Map<Integer, Integer >visitedNumbers = new HashMap<>();
for (int i = 0; i < numbers.length; i++) {
	int delta=target-numbers[i];
	if (visitedNumbers.containsKey(delta)) {
		return new int[] {i,visitedNumbers.get(delta)};
	}
	visitedNumbers.put(numbers[i], i);
}
return new int[] {-1,-1};
}

}
