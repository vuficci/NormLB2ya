import java.util.Scanner;

public class game {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Угадай число");
    System.out.println("От 1 до 100: ");
    int target = (int) (Math.random() * 100) + 1;
    int guess = 0;
    while (guess != target) {
      guess = scanner.nextInt();
      if (guess < target) {
        System.out.println("Больше: ");
      } else if (guess > target) {
        System.out.println("Меньше: ");
      }
    }
    System.out.println("Победа");
    scanner.close();
  }
}
