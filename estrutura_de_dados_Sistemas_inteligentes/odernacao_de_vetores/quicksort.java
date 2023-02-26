/*No Quicksort, a lista é dividida em sublistas. 
Essas sublistas são as partições. 
Cada uma das partições é dividida novamente em outras partições até que a divisão não tem mais como acontecer.
 Nesse caso, a partição vai ter apenas um elemento.
 O Pivô é o elemento escolhido de dentro da lista, normalmente, é o primeiro elemento. 
 Ele ajuda a determinar as partições, de forma que os elementos da primeira partição são menores ou iguais ao pivô, depois vem o pivô, e os elementos da segunda lista são maiores do que o pivô. */

 public static void quicksort(int p, int q, int vetor[])

   {

     int x;

 

     if (p < q)

      {

        x = particao(p, q, vetor);

        quicksort(p, x - 1, vetor);

        quicksort(x + 1, q, vetor);

      }

   }

 

public static int particao(int p, int q, int vetor[])

   {

     int j = p - 1;

     int temp, aux = vetor[q];

 

     for (int i = p; i <= q; i++)

      {

        if (vetor[i] <= aux)

         {

           j++;

           temp = vetor[i];

           vetor[i] = vetor[j];

           vetor[j] = temp;

         }

      }

     return j;

   }

 