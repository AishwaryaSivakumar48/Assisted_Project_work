package searching;

import java.util.Scanner;

public class linear_search {

	public static void main(String[] args) {
		{
			int count, n, i, arr[];

			Scanner input = new Scanner(System.in);
			System.out.println("Enter number of elements:");
			n = input.nextInt();

			arr = new int[n];
			System.out.println("Enter " + n + " integers");

			for (count = 0; count < n; count++)
				arr[count] = input.nextInt();

			System.out.println("Enter the search value:");
			i = input.nextInt();

			for (count = 0; count < n; count++) {
				if (arr[count] == i) {
					System.out.println(i + " is present at location " + (count + 1));

					break;
				}
			}
			if (count == n)
				System.out.println(i + " doesn't exist in array.");
		}
	}

}
