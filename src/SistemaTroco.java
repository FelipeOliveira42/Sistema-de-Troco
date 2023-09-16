import java.util.Scanner;

public class SistemaTroco {
    public static void main(String[] args) {
        Troco nota50 = new Nota50();
        Troco nota10 = new Nota10();
        Troco nota2 = new Nota2();
        Troco moeda1 = new Moeda1();

        nota50.definirProximo(nota10);
        nota10.definirProximo(nota2);
        nota2.definirProximo(moeda1);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do troco desejado: R$ ");
        int valorTroco = scanner.nextInt();

        System.out.println("Calculando troco para R$ " + valorTroco);
        nota50.calcularTroco(valorTroco);
    }
}
