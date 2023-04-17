package transporte;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author kadu
 */
public class Transporte {

    private int capacidadeTanque;
    private int capacidadePassageiros;
    private float preco;

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        if (capacidadeTanque > 0) {
            this.capacidadeTanque = capacidadeTanque;
        }

    }

    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }

    public void setCapacidadePassageiros(int capacidadePassageiros) {
        if (capacidadePassageiros > 0) {
            this.capacidadePassageiros = capacidadePassageiros;
        }
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        if (preco > 0.00) {
            this.preco = preco;
        }
    }

    public void entrada() {
        Scanner sc = new Scanner(System.in);
        try {
            //System.out.println("=================================");
            System.out.println("Capacidade do Tanque:      ");
            setCapacidadeTanque(sc.nextInt());
            System.out.println("Capacidade do Passageiros:      ");
            setCapacidadePassageiros(sc.nextInt());
            System.out.println("Preco:      ");
            setPreco(sc.nextFloat());
        } catch (InputMismatchException ex1) {
            System.out.println("Entrada de dados invalida, somente numeros inteiros ");
            System.out.println("Valor sera modificado para 0 ");
        }

    }

    public void imprimir() {
        //System.out.println("=================================")
        System.out.println("A capacidade do tanque e:   " + getCapacidadeTanque() + "   litros");
        System.out.println("A capacidade de passageiros e:   " + getCapacidadePassageiros());
        System.out.println("O preco e :   " + getPreco());

    }

}
