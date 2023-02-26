package Descomplica.estrutura_de_dados_Sistemas_inteligentes.Fila;

public class fila {
    int tamanho, inicio, fim, total;
    int vetor[];
    fila(int tam){
        inicio = 0;
        fim = 0;
        total = 0;
        tamanho = tam;
        vetor = new int [tam];
    }
}
