//Exercicio 1) F) da lista de exercicios passada na aula 11

public class Ex1f
{
// O m�todo main � o ponto de entrada do programa:
static public void main(String[] args)
{

//Declara as variaveis
float Raio = Float.parseFloat(args[0]);
float Area = Float.parseFloat(args[1]);
float pi = (float)3.14;

//operações a serem feitas
float Volume = pi * (Raio * Raio) * Area;

//Imprimi o resultado da operação
System.out.print("O Volume do galao e de "+Volume+" Litros");
}
}
