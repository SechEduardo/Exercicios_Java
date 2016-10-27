/**
* Unicesumar � Centro Universitario Cesumar
* Curso: Analise e Desenvolvimento de Sistemas
* Autor:Eduardo Sech
* Data:05/10/2016
*/
public class Ex2c
{
// O metodo main e o ponto de entrada do programa:
static public void main(String[] args)
{
//Declara variavel
float n1 = Float.parseFloat(args[0]);
float n2 = Float.parseFloat(args[1]);
float n3 = Float.parseFloat(args[2]);
float n4 = Float.parseFloat(args[3]);
float mediaf = ((n1 + n2 + n3 + n4) / 4);

//Logica do programa
if (mediaf >= 6.0){
System.out.println("A media final e "+mediaf);
System.out.println("O aluno esta aprovado.");
}
else {
System.out.println("A media final e "+mediaf);
System.out.println("O aluno esta reprovado.");
}
}
}
