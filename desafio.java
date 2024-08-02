public class desafio {
    public static void main(String[] args) {
        int[] vetor = new int[5]; //com valores pré definidos para teste

        vetor[0] = 4;
        vetor[1] = 7;
        vetor[2] = 3;
        vetor[3] = 1;
        vetor[4] = 5;

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

        System.out.println("Ordenado com Selection Sort:");
        for(int indice = 0; indice < vetor.length; indice++){
            System.out.println(vetor[indice]);
        }
    }
}