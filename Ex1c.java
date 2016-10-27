/**
1c) Ler uma temperatura em graus Fahrenheit e apresenta-la convertida em graus Celsius. A
fórmula de conversão a ser utilizada é C = (( F – 32 ) * 5) / 9, em que a variável F representa a
temperatura em graus Fahrenheit e a variável C a temperatura em graus Celsius.
*/
public class Ex1c
{
// O m�todo main � o ponto de entrada do programa:
static public void main(String[] args)
{
//conversão de string para float.
float tempF = Float.parseFloat(args[0]);

//operação que converte Fahrenheit para Celsius.
float TempC =  (( tempF - 32 ) * 5) / 9;

//Resultado da conversão
System.out.println("A temperatura em Celsius e " +TempC+"C" );
}
}
