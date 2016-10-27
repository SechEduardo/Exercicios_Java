/**
* Unicesumar � Centro Universit�rio Cesumar
* Curso: An�lise e Desenvolvimento de Sistemas
* Autor:Eduardo Sech
* Data:17/10/2016
*/
public class Ex2g
{
static public void main(String[] args){

float n1 = Float.parseFloat(args[0]);

if ( n1 > 0  && n1 < 10)
{
  System.out.println("O valor esta na faixa permitida.");
}
else
{
  System.out.println("O valor esta fora da faixa permitida.");
}
}
}
