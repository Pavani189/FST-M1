package activities;

	public class Activity4 {

	    public static void insertionSort(int[] array) {
	        for (int i = 1; i < array.length; i++) {
	            int key = array[i];
	            int j = i - 1;
	            
	            while (j >= 0 && array[j] > key) {
	                array[j + 1] = array[j];
	                j = j - 1;
	            }
	            array[j + 1] = key;
	        }
	    }

	    public static void printArray(int[] array) {
	        for (int i : array) {
	            System.out.print(i + " ");
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        int[] array = {12, 11, 13, 5, 6, 7};
	        
	        System.out.println("Array before sorting:");
	        printArray(array);
	        
	        insertionSort(array);
	        
	        System.out.println("Array after sorting:");
	        printArray(array);
	    }
	}
