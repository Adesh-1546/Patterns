import java.util.Scanner;

public class AnimateTriangle {
	public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
                Thread.sleep(100); // 100 milliseconds delay for animation effect
            }
            System.out.println();
        }

        sc.close();
    }

}
