import java.util.Scanner;
public class testLocation {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of rows and columns in the array: ");
		Location location = new Location();
		location.row = input.nextInt();
		location.column = input.nextInt();
		double[][] a = new double[location.row][location.column];
		System.out.println("Enter the array:");
		for (int i = 0; i < location.row; i++) {
			for (int j = 0; j < location.column; j++) {
				a[i][j] = input.nextDouble();
			}
		}
		location.locateLagest(a);
		System.out.println("The location of the largest element is " + location.maxValue + " at (" + (location.row+1) + "," + (location.column+1) + ")");
	}

}
