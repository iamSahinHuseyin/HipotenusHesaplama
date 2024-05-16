import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Kullanıcıdan alınan üçgen kenar uzunluklarına göre dik kenar uzunluğu bulmak.(Hip. hesaplama).
        Scanner sc = new Scanner(System.in);
        int kenar1;
        int kenar2;
        double uzunKenar;

        System.out.print("Kenar 1'i giriniz: ");
        kenar1 = sc.nextInt();
        System.out.print("Kenar 2'i giriniz: ");
        kenar2 = sc.nextInt();
        uzunKenar = Math.sqrt((kenar1 * kenar1 + kenar2 * kenar2));
        System.out.println("Uzun Kenar: " + uzunKenar);3
        }
    }
