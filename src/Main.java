import java.util.Scanner;
public class Main {

    static int uslu(int a, int b) {
        if (b == 0) {
            return 1;
        }
        if (b < 0) {
            System.out.println("Hatalı bir us girdiniz");
            return -1;
        }
        int result = 1;
        return a * uslu(a, b - 1);
        }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Tabanı giriniz: ");
        int a = scan.nextInt();

        System.out.print("Üssü giriniz: ");
        int b = scan.nextInt();


        int uslu = uslu(a, b);
        System.out.println("Sonuç: " + uslu);
        if (uslu != -1) {
            System.out.println("Sonuç: " + uslu);
        }
    }
}

