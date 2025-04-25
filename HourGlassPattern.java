
public class HourGlassPattern {
	 public static void main(String[] args) {
	        int n = 5;

	        // Top half
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < i; j++) System.out.print(" ");
	            for (int j = 0; j < (2 * (n - i) - 1); j++) {
	                if (j == 0 || j == (2 * (n - i) - 2) || i == 0)
	                    System.out.print("*");
	                else
	                    System.out.print(" ");
	            }
	            System.out.println();
	        }
	        
	        // Bottom half
	        for (int i = 1; i < n; i++) {
	            for (int j = i; j < n - 1; j++) System.out.print(" ");
	            for (int j = 0; j < (2 * i + 1); j++) {
	                if (j == 0 || j == (2 * i) || i == n - 1)
	                    System.out.print("*");
	                else
	                    System.out.print(" ");
	            }
	            System.out.println();
	        }

	 }
}
