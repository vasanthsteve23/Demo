import java.util.Scanner;

public class Sample2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print(a + "Hello Universe...123");
        System.out.print(a + "Hello Universe...1234");
        System.out.print(a + "Hello Universe...12345");

        sc.close();
    }
}
