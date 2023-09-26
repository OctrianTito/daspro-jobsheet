import java.util.Scanner;
public class PemilihanPercobaan123 {
    public static void main(String[] args) {
        Scanner input23 = new Scanner(System.in);

        System.out.print("Masukkan angka : ");
        int angka = input23.nextInt();

       String hasil = (angka % 2 == 0) ? "genap" : "ganjil";
       System.out.print("Angka " + angka + " bilangan " + hasil);
    }
}
