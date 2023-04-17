package transporte;

import java.util.Scanner;

/**
 *
 * @author kadu
 */
public class AppTransporte {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Navio vetNavio[] = new Navio[1];

        for (int i = 0; i < vetNavio.length; i++) {

            vetNavio[i] = new Navio();
            System.out.println("============INSIRA OS DADOS DO " + (i + 1) + "-Navio=============");
            vetNavio[i].entrada();
            

        }

        for (int i = 0; i < vetNavio.length; i++) {
            System.out.println("============" + (i + 1) + "-Navio=============");
            vetNavio[i].imprimir();
            vetNavio[i].divisao();
        }

        Avião vetaviao[] = new Avião[1];

        for (int a = 0; a < vetaviao.length; a++) {

            vetaviao[a] = new Avião();
            System.out.println("============INSIRA OS DADOS DO " + (a + 1) + "-Aviao=============");
            vetaviao[a].entrada();

        }

        for (int a = 0; a < vetaviao.length; a++) {
            System.out.println("============" + (a + 1) + "-Aviao=============");
            vetaviao[a].imprimir();
            vetaviao[a].reajustepreco();
        }
    }
}
