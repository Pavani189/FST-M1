package activities;

public class Activity2 {

	public static void main(String[] args) {
        int[] numbers = {10, 77, 10, 54, -11, 10};
        
        int sum = 0;
        
        for (int number : numbers) {
            if (number == 10) {
                sum += number;
            }
        }
        
        boolean result = (sum == 30);
        
        System.out.println("The sum of all 10's is exactly 30: " + result);
    }
}
