/*
1e) Ler uma temperatura em graus Fahrenheit e apresentá-la convertida em Kelvin. Para
conversão deve-se primeiro converter em graus Celsius conforme exercício anterior, e depois
converter em Kelvin
*/
public class Ex1e
{
// O m�todo main � o ponto de entrada do programa:
static public void main(String[] args)
{
//Declara as variaveis
float tempF = Float.parseFloat(args[0]);
float tempc = (( tempF - 32 ) * 5) / 9;
float tempk = tempc + (float) 273.15;

//Imprimi o resultado
System.out.println("A temperatura em Kelvin e " +tempk+"K" );
}
}
