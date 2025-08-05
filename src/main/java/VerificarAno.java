
import java.time.LocalDate;

public class VerificarAno {

    public static void main(String[] args) {
        boolean ano = LocalDate.now().isLeapYear();
        if(ano) {
            System.out.println("Esse ano é bissexto!");
        } else {
            System.out.println("Não estamos em ano bissexto!");
        }
    }

}
