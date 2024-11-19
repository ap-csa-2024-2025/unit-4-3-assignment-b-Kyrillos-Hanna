import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // You can test your method here.
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    System.out.println(isPrime(num));
  }

  public static boolean isPrime(int N)
  {
    if (N == 1) {
      return false;
    }
   for (int i = 2; i < N; i++) {
    if (N % i == 0) {
      return false;
    }
   }
    return true;
  }
}
