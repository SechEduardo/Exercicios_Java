/**
* Unicesumar � Centro Universit�rio Cesumar
* Curso: An�lise e Desenvolvimento de Sistemas
* Autor:Eduardo Sech
* Data:11/10/2016
*/
public class Ex2a
{
// O m�todo main � o ponto de entrada do programa:
static public void main(String[] args)
{
//declara as variaveis
int val1 = Integer.parseInt( args[0] );
int val2 = Integer.parseInt( args[1] );
int val3 = 0;

//Lógica do programa
if (val1 > val2)
{
  val3 = val1 - val2;
}
else if  (val2 > val1)
{
  val3 = val2 - val1;
}
else if (val1 == val2)
{
  val3 = 0;
}
System.out.print("A diferenca entre os dois valores e de "+val3);
}
}
