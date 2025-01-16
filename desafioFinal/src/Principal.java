import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o limite do seu cartão de crédito: ");
        double limite = sc.nextDouble();

        CartaoCredito cartao = new CartaoCredito(limite);

        int opcao = 1;
        while(opcao != 0){
            System.out.println("Informe a descrição da compra: ");
            String descricao = sc.next();

            System.out.println("Informe o valor da compra: ");
            double valor = sc.nextDouble();

            Compra compra = new Compra(descricao, valor);
            boolean compraRealizada = cartao.lancaCompra(compra);

            if (compraRealizada){
                System.out.println("Compra realizada!");
                System.out.println("Digite 0 para sair ou 1 para continuar!");
                opcao = sc.nextInt();
            } else {
                System.out.println("Saldo insuficiente!!!");
                opcao = 0;
            }

        }

        System.out.println("--------------------------------------------------------------------");
        System.out.println("COMPRAS REALIZADAS: \n");

        Collections.sort(cartao.getCompras());

        for (Compra c : cartao.getCompras()){
            System.out.println(c.getDescricao() + " - R$" + c.getValor());
        }

        System.out.println("--------------------------------------------------------------------");
        System.out.println("\nSaldo do cartão: R$" + cartao.getSaldo());



    }
}
