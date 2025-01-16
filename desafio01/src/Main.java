import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        Pessoa pessoa1 = new Pessoa("Vinicius", 23);
        Pessoa pessoa2 = new Pessoa("Jean", 24);
        Pessoa pessoa3 = new Pessoa("Luis", 21);

        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        System.out.println("Tamanho da Lista: " + listaDePessoas.size());

        System.out.println("Primeira Pessoa: " + listaDePessoas.get(0));

        System.out.println("Lista de Pessoas: ");
        for (Pessoa pessoa : listaDePessoas){
            System.out.println(pessoa);
        }
    }
}
