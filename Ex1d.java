/**
1d) Ler uma temperatura em graus Celsius e apresenta-la convertida em graus Kelvin. A fórmula
para conversão é K = C + 273.15, onde K é a temperatura em Kelvin e C é a temperatura em
graus Celsius.
*/
public class Ex1d
{
// O m�todo main � o ponto de entrada do programa:
static public void main(String[] args)
{
//Conversão de string para Float
float tempC = Float.parseFloat(args[0]);

//Operação de conversão de Celsius para Kelvin
float tempK =(float) 273.15 + tempC;

//Impressão da conversão
System.out.println("A temperatura em Kelvin e " +tempK+"K" );
}
}
