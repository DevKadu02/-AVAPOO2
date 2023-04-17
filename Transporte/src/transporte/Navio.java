package transporte;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author kadu
 */
public class Navio extends Transporte {

    private String nome;
    private int capacidadetripulantes;
    private String dataLancamento;
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (!nome.isEmpty());
        {
            this.nome = nome;
        }
    }

    public int getCapacidadetripulantes() {
        return capacidadetripulantes;
    }

    public void setCapacidadetripulantes(int capacidadetripulantes) {
        if (capacidadetripulantes < 0);
        {
            this.capacidadetripulantes = capacidadetripulantes;
        }
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(String dataLancamento) {

        {
            this.dataLancamento = dataLancamento;
        }
    }
    
    public void divisao(){
        int div1= getCapacidadetripulantes();
        int div2= getCapacidadePassageiros();
        float div3=  (div2 / div1);
        System.out.println("Divisao do num de passageiros pelo de tripulantes:      " +div3);
    }

    @Override
    public void entrada() {
        Scanner sc = new Scanner(System.in);
        super.entrada();
       try{ System.out.println("Qual o nome do navio:      ");
        setNome(sc.nextLine());
        System.out.println("Qual a data de lancamento:    ");
        setDataLancamento(sc.nextLine());
        System.out.println("Qual o numero de tripulantes:      ");
        setCapacidadetripulantes(sc.nextInt());
       }
        catch (InputMismatchException ex1) {
            System.out.println("Entrada de dados invalida, somente numeros inteiros ");
            System.out.println("Valor sera modificado para 0 ");
        }
      
            
        }

    

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("O nome e:      " + getNome());
        System.out.println("O numero de tripulante e:      " + getCapacidadetripulantes());
        System.out.println("A data de lancamento e:      " + getDataLancamento());
        //System.out.println("Divsao:     " + getDiv3());
    }

}
