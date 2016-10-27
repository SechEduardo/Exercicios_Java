/**
* Unicesumar � Centro Universit�rio Cesumar
* Curso: An�lise e Desenvolvimento de Sistemas
* Autor:Eduardo Sech
* Data:18/10/2016
*/
public class TesteEx2e
{
// O m�todo main � o ponto de entrada do programa:
static public void main(String[] args)
{
/*
float n1 = Float.parseFloat(args[0]);
float n2 = Float.parseFloat(args[1]);
float n3 = Float.parseFloat(args[2]);
float n4 = Float.parseFloat(args[3]);
int c = 0;
*/

for (int c = 0; c < 4; c++){
  float x = Float.parseFloat(args[c]);
    if ((x % 2 == 0) && (x % 3 == 0)){
    System.out.println("Esse numero e divisivel por 2 e 3: "+ x);
}
    else {
    System.out.println("Esse numeros nao e divisiveis por 2 e 3: "+ x);
    }
}
}
}
