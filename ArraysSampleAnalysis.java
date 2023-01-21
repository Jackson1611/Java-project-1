import java.util.Arrays;
import java.util.Scanner;

public class ArraysSampleAnalysis {

	public static int getMax(int Array[]) {
		int maxValue = Array[0];
		for (int i = 0; i < Array.length; i++) {
			if (Array[i] > maxValue) {
				maxValue = Array[i];
			}
		}
		return maxValue;

	}

	public static int getMin(int Array[]) {
		int minValue = Array[0];
		for (int i = 0; i < Array.length; i++) {
			if (Array[i] < minValue) {
				minValue = Array[i];
			}
		}
		return minValue;

	}

	public static double getMedian(int Array[]) {
		Arrays.sort(Array);
		double median;
		int totalElements = Array.length;
		if (totalElements % 2 == 0) {
			int sumOfMiddleElements = Array[totalElements / 2] + Array[totalElements / 2 - 1];
			median = ((double) sumOfMiddleElements) / 2;
		} else {
			median = (double) Array[Array.length / 2];
		}
		return median;
	}

	public static double getMean(int[] numArray) {
		double sum = 0;
		for (int i = 0; i < numArray.length; i++) {
			sum += numArray[i];
		}
		return sum / numArray.length;
	}

	private static double getStandardDeviation(int[] numArray) {
		double sum = 0.0, standardDeviation = 0.0;
		int length = numArray.length;
		for(double num : numArray) 
		{
		sum += num;
		}
		double mean = sum/length;
		for(double num: numArray) 
		{
		standardDeviation += Math.pow(num - mean, 2);
		}
		return Math.sqrt(standardDeviation/length);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of values: ");
		int numOfValue = input.nextInt();

		int[] numArray = new int[numOfValue];
		int length = numArray.length;
		for (int i = 0; i < length; i++) {

			System.out.print("Enter an integer: ");
			numArray[i] = input.nextInt();

		}
		System.out.println();
		System.out.println("n = " + numOfValue);
		System.out.println("Min: " + getMin(numArray));
		System.out.println("Max: " + getMax(numArray));
		System.out.println("Mean: " + getMean(numArray));
		System.out.println("Median: " + getMedian(numArray));
		System.out.println("Sample standard deviation: " + getStandardDeviation(numArray));
		
		for (int i = 0; i < length; i++) {
		System.out.print( numArray[i] + " " );
		}
	}

}
