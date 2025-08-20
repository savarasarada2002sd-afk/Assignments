

	public static void main(String[] args) 
	import java.util.Scanner;

			public class EvenOddArray {
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

			        // Check and print even or odd
			        System.out.println("\nChecking Even/Odd:");
			        for (int i = 0; i < n; i++) {
			            if (arr[i] % 2 == 0) {
			                System.out.println(arr[i] + " is Even");
			            } else {
			                System.out.println(arr[i] + " is Odd");
			            }
			        }
			    }
			}