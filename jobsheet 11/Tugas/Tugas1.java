import java.util.Scanner;
public class Tugas1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N = ");
        int N = sc.nextInt();
        
        for (int i = 0; i < N; i++) {
            for (int j = N-1; j > i; j--) {
                System.out.print(" ");
                }
            for (int k = 0; k <=i; k++) {
                    System.out.print(k+1);
            }
        System.out.println();
        }
    }
}