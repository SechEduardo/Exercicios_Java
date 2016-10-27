/**
* Unicesumar � Centro Universit�rio Cesumar
* Curso: An�lise e Desenvolvimento de Sistemas
* Autor:Eduardo Sech
* Data:05/10/2016
*/
import java.util.Scanner;
import java.util.Arrays;
public class Ex2d
{
static public void main(String[] args)
{
//Inicializa o Scanner
Scanner s = new Scanner(System.in);

//Declaração de variaveis
int vet_num[];
vet_num = new int[3];
int x;

//Entrada de dados
  for(x=0 ; x < 3 ; x++){
      System.out.println("Digite um Valor: ");
        vet_num[x] = s.nextInt();
    }
//logica do programa
Arrays.sort(vet_num);
  for (x = 0; x < 3 ; x++){
    System.out.print("Valor: \n");
    System.out.print("--> " + vet_num[x] + "\n");;
}
}
}
