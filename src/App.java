import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        LDE listaDE = new LDE();

        listaDE.addFirst(1);
        listaDE.addFirst(2);
        listaDE.addFirst(2);
        listaDE.addFirst(2);
        listaDE.addFirst(3);
        listaDE.addFirst(4);
        listaDE.addFirst(3);
        listaDE.addFirst(5);

        listaDE.exibirLista();

        // Deletar os 2.
        /*listaDE.delete(2);
        listaDE.delete(2);
        listaDE.delete(2);
        listaDE.exibirLista();*/

        // Deletar duplicados:

        listaDE.deleteDuplicate();
        listaDE.exibirLista();

        listaDE.sortList();
        listaDE.exibirLista();

        // Deletar duplicados (com parâmetro):
        /*listaDE.deleteDuplicate(2);
        listaDE.deleteDuplicate(3);
        listaDE.exibirLista();*/

    /*   String nome, rg;
        LDEPessoa lde = new LDEPessoa();
        int op;
        do {
            exibirLista();
            op = in.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Insira seu nome: ");
                    nome = in.next();
                    System.out.println();
                    System.out.println("Insira seu RG: ");
                    rg = in.next();
                    System.out.println();

                    Pessoa novaPessoa = new Pessoa(nome, rg);
                    lde.addLast(novaPessoa);
                    break;

                default:

            }

        } while (op != 0);
    }

    public static void exibirLista() {
        System.out.println(
                "\n1 - Cadastrar uma pessoa: \n2 - Cancelar o registro de uma pessoa: \n3 - Exibir os dados das pessoas que estão no prédio: \n4 - Verificar se uma pessoa se contra no prédio: \n5 - Informar quantas pessoas estão no prédio: \n6 - Remover uma pessoa do cadastro: \n0 - Parar o programa: \n");
        System.out.println("Informe a opção desejada: ");
    }
    */
    }
}
