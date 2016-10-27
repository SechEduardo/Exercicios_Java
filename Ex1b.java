/**
1b) Ler uma temperatura em graus Celsius e exibi-la convertida em graus Fahrenheit. A fórmula de
conversão a ser utilizada é F = ( 9 * C + 160 ) / 5, em que a variável F representa a temperatura
*/
import java.util.Scanner;
public class Ex1b
{
// O m�todo main � o ponto de entrada do programa:
static public void main(String[] args)
{
//Declara as variaveis
Float f, c;

//inicializa o Scanner
Scanner s = new Scanner(System.in);

//Codigo para ler entrada do teclado
System.out.print("Entre com o valor em celsius:");
c = s.nextFloat();

//Operação de conversão
f=(9 * c + 160) / 5;

//imprimi o resultado da conversão
System.out.println("A temperatura em Fahrenheit e " +f+"F" );
}
}
