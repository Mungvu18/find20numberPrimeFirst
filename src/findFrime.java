import java.util.Scanner;

public class findFrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng số nguyên tố cần tim");
        int number = sc.nextInt();
        int n = 2;
        int count = 0;
        while (count < number) {
            if (n == 2) {
                System.out.println(n + " là số nguyê tố");
                n++;
                count++;
            }
            if (n > 2) {
                if (testNumber(n)) {
                    count++;
                    System.out.println(n + " Là số nguyên tố");
                }
                n++;
            }
        }
    }

    static boolean testNumber(int n) {
        boolean flag = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                flag = false;
            }
        }
        return flag;
    }
}