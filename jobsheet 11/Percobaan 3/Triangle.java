import java.util.Scanner;
public class Triangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N = ");
        int N = sc.nextInt();
        
        int i = 0;
        int baris = 1;
        while (i <= N) {
            int j = 0;
            while (j < baris) {
                System.out.print("*");
                j++;
            }
        baris++;
        i++;
        System.out.println();
        }
    }
}