import java.util.Scanner;

public class SequenciaFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int f1 = 0;
        int f2 = 1;
        int limit = scanner.nextInt();

        while(f2 < limit) {
            int fn = f1 + f2;
            if(fn > limit) {
                break;
            }
            f1 = f2;
            f2 = fn;
            System.out.println(fn);

        }

    }
}
