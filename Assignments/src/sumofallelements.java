
		import java.util.Scanner;

		public class sumofallelements {
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        // Taking array size input
		        System.out.print("Enter the number of elements: ");
		        int n = sc.nextInt();

		        int[] arr = new int[n];
		        int sum = 0;

		        // Taking array elements input
		        System.out.println("Enter the elements:");
		        for (int i = 0; i < n; i++) {
		            arr[i] = sc.nextInt();
		            sum += arr[i];  // Adding elements to sum
		        }

		        // Display result
		        System.out.println("The sum of all elements is: " + sum);
		    }
		}
		