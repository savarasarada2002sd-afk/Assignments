
public class primenumber{
	import java.util.Scanner;
	    
	    // Method to check if a number is prime
	    public static boolean isPrime(int num) {
	        if (num <= 1) return false; // 0, 1, and negatives are not prime
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input array size
	        System.out.print("Enter the number of elements: ");
	        int n = sc.nextInt();

	        int[] arr = new int[n];

	        // Input array elements
	        System.out.println("Enter the elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        // Print prime numbers
	        System.out.println("\nPrime numbers in the array are:");
	        for (int i = 0; i < n; i++) {
	            if (isPrime(arr[i])) {
	                System.out.print(arr[i] + " ");
	            }
	        }
	    }
	
	

