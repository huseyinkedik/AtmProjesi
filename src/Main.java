import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan veri girişi beklenir.
        System.out.print("n1 sayısını giriniz: ");
        int n1 = input.nextInt();
        System.out.print("n2 sayısını giriniz: ");
        int n2 = input.nextInt();

        int ebob = 0;
        int ekok = 0;
        int i = 1;

        //Döngü ile ebob hesaplanır.
        while (i <= n2) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
            }
            i++;
        }
        System.out.println("Ebob: " + ebob);

        //Ekok formülü ile ekok yazdırılır.
        ekok = (n1 * n2) / ebob;
        System.out.println("Ekok: " + ekok);
    }
}
