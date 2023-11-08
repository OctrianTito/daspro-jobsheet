import java.util.Scanner;
import java.util.Random;
public class Quiz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        char menu = 'y';
        do {
            int number = random.nextInt(10) + 1;
            boolean success = false;
            do {
                System.out.print("Tebak angka (1-10): ");
                int answer = sc.nextInt();
                sc.nextLine();
                
                if (answer < number) {
                    System.out.println("Tebakan Anda terlalu kecil. Coba lagi.");
                } else if (answer > number) {
                    System.out.println("Tebakan Anda terlalu besar. Coba lagi.");
                } else {
                    success = true;
                    System.out.println("Selamat! Anda menebak dengan benar.");
                } 
            } while (!success); {
                System.out.print("Apakah anda ingin mengunlang permainan? (Y/N) : ");
            menu =  sc.next().charAt(0);
        }  
        } while (menu == 'y' || menu == 'Y');
    }
}

