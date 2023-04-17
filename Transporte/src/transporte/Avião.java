package transporte;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author kadu
 */
public class Avião extends Transporte {

    private String prefixo;
    private String dataRevisao;

    public String getPrefixo() {
        return prefixo;
    }

    public void setPrefixo(String prefixo) {
        if (!prefixo.isEmpty());
        {
            this.prefixo = prefixo;
        }
    }

    public String getDataRevisao() {

        return dataRevisao;
    }

    public void setDataRevisao(String dataRevisao) {
        if (!dataRevisao.isEmpty());
        {
            this.dataRevisao = dataRevisao;
        }
    }

    public void reajustepreco() {
        Scanner sc = new Scanner(System.in);
        String reajustar;
        String sim = "s";
        float reajuste;
        System.out.println("Deseja reajustar o preco? Digite 's' para continuar ou enter tecla para terminar");
        reajustar = sc.nextLine();
        if(sim.equals(reajustar)) {
    
            System.out.println("Digite o valor percentual para ajustar o preço, exemplo 10 para 10% de reajuste");
            
            reajuste = Float.parseFloat(sc.nextLine());
            
            System.out.print("Preco Reajustado: " + (getPreco() * ((reajuste / 100) + 1)));
        }
    }
    @Override
    public void entrada() {
        Scanner sc = new Scanner(System.in);
        super.entrada();
        try{ System.out.println("Qual o prefixo do aviao:      ");
        setPrefixo(sc.nextLine());
        System.out.println("Qual a data de revisao:      ");
        setDataRevisao(sc.nextLine());
        }
        catch (InputMismatchException ex1) {
            System.out.println("Entrada de dados invalida, somente numeros inteiros ");
            System.out.println("Valor sera modificado para 0 ");
    }
    }
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("O prefixo e:      " + getPrefixo());
        System.out.println("A data de revisao e:      " + getDataRevisao());
    }

}
