import java.util.Scanner;

public class findFrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng số nguyên tố cần tim");
        int number = sc.nextInt();
        int n = 2;
        int count = 0;
        while (count<number){
            if(testPrime(n)){
                count++;
                System.out.println(n+" là số nguyên tố");
            }
            n++;
        }
    }
    public static boolean testPrime(int n){
            if (n == 2) {
                return true;
            }
            if (n > 2) {
                for (int i = 2; i < n; i++) {
                    if (n % i == 0) {
                        return false;
                    }
                }
            }
        return true;
        }
    }

