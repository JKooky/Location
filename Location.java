public class Location {
	public static int row,column;
	public static double maxValue;
	
	public static Location locateLagest(double[][] a) {
		maxValue = a[0][0];
		for(int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if(a[i][j] > maxValue) {
					maxValue = a[i][j];
					row = i;
					column = j;
				}
			}
		}
		return null;
	}
}