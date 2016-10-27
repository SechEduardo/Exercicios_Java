/**
* Unicesumar � Centro Universit�rio Cesumar
* Curso: An�lise e Desenvolvimento de Sistemas
* Autor:Eduardo Sech
* Data:11/10/2016
*/
public class Ex2b
{
// O m�todo main � o ponto de entrada do programa:
static public void main(String[] args)
{
//Definição de variaveis em main
int val1 = Integer.parseInt( args[0] );

//Logica do Programa
if (val1 < 0)
{
  System.out.println(val1 * -1);
}
else {
  System.out.println(val1);
}
}
}
