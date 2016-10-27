import java.util.Arrays;  //Biblioteca para ordenar os vetores
import java.util.Scanner; //Biblioteca para pedir dados ao usuário
public class Ex2h
{
static public void main(String[] args){

//Inicializa o scanner.
Scanner s = new Scanner(System.in);

//Declara as variaveis
int vet_num[];
vet_num = new int[5];
int x;

//Entrada de dados
for(x = 0; x < 5; x++){
    System.out.println("Digite o " + (x+1) + " valor: ");
        vet_num[x] = s.nextInt();
}
//Ordenação do valor dos vetores
Arrays.sort(vet_num);

//Variavel auxiliar
int menor = vet_num[0];
int maior = vet_num[4];

//Impressão dos valores pedidos
System.out.print("O valor mais baixo digitado e: " +menor+"\n");
System.out.print("O valor mais alto digitado e: "+maior);
}
}
