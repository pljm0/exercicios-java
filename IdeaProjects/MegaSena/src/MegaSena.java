
import java.util.Date;
import java.util.Locale;
import java.util.Random;


public class MegaSena {

    public static void main(String[] args) {
        Random generator = new Random();
        Date relogio = new Date();
        Locale idioma = Locale.getDefault();
        br.com.teste.megasena.User user = new br.com.teste.megasena.User();

        for(int i = 0; i < 6; i++) {
            int number = generator.nextInt(60);
            System.out.println(number);
        }
        System.out.println(relogio.toString());
        System.out.println(idioma);
    }
}
