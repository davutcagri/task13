import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Faktöriyel hesaplaması için bir sayı giriniz: ");
        int a = scanner.nextInt();
        System.out.println(a + " sayısının faktöriyeli: " + faktoriyel(a));
    }

    public static int faktoriyel(int a) {
        if(a > 1) {
            return (a * faktoriyel(a - 1));
        }
        else {
            return 1;
        }
    }
}