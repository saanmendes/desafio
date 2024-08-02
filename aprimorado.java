import java.util.*;

public class aprimorado { //permite o usuário adicionar a quantia de vetores e seus próprios valores
    //porém, é uma desvantagem caso a pessoa queira utilizar muitos valores, já que existem métodos mais ágeis
    public static void main(String[] args) {

        int[] vetor = new int[scanner("Digite a quantidade de vetores para ordenar: ").nextInt()];

        InserirValores(vetor);

        SelectionSort(vetor);

        ResultadoSelectionSort(vetor);
    }

    public static void InserirValores(int[] vetor){
        for (int indice = 0; indice < vetor.length; indice++) {
            vetor[indice] = scanner("Digite o valor que você deseja ordenar: ").nextInt();
        }
    }

    public static void SelectionSort(int[] vetor){ //modo de fazer a ordenação
        int posicao_menor, auxiliar;
        for(int indice = 0; indice < vetor.length; indice++){
            posicao_menor = indice;
            for(int subIndice = indice + 1; subIndice < vetor.length; subIndice++){
                if (vetor[subIndice] < vetor[posicao_menor]){
                    posicao_menor = subIndice;
                }
            }
            auxiliar = vetor[posicao_menor];
            vetor[posicao_menor] = vetor[indice];
            vetor[indice] = auxiliar;
        }
    }

    public static void ResultadoSelectionSort(int[] vetor){ //imprimir resultado
        System.out.println("\nOrdenado com Selection Sort:");
        for(int indice = 0; indice < vetor.length; indice++){
            System.out.println(vetor[indice]);
        }
    }

    public static Scanner scanner(String message){
        System.out.print(message);
        return new Scanner(System.in);
    }
}