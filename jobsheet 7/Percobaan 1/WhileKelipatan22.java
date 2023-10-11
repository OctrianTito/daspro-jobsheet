import java.util.Scanner;
public class WhileKelipatan22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kelipatan, jumlah = 0, counter = 0;
        double rerata;
        System.out.print("Masukkan bilangan kelipatan (1-9) : ");
        kelipatan = sc.nextInt();
        int i = 1;
        while(i <= 50) {
            if (i % kelipatan == 0) {
                jumlah += i;
                counter++;
            }
            i++;
        } 
        rerata = jumlah / counter;

        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, jumlah);
        System.out.printf("Rata - rata dari bilangan kelipatan %d adalah %f", kelipatan, rerata);
    }
}