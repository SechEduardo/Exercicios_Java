/**
1a) Calcule a quantidade de litros de combustível gasta em uma viagem, utilizando um automóvel
que faz 12 km por litro. Para obter o cálculo, o usuário deve fornecer o tempo gasto na viagem
e a velocidade média. Desta forma, será possível obter a distância percorrida com a fórmula
DISTANCIA = TEMPO * VELOCIDADE. Tendo o valor da distância, basta calcular a quantidade de
litros de combustível utilizada na viagem com a fórmula LITROS_USADOS = DISTANCIA / 12. O
programa deve apresentar os valores da velocidade média, tempo gasto, distância percorrida e
quantidade de litros utilizada na viagem
*/
import java.util.Scanner;
public class Ex1a
{
// O m�todo main � o ponto de entrada do programa:
static public void main(String[] args)
{
//Inicializa scanner
Scanner s = new Scanner(System.in);

//Declara as variaveis
Float t, vmedia;
float dist = 0;
float litcomb = 0;


System.out.print("Digite o tempo de viagem(Horas): ");
t = s.nextFloat();

System.out.print("Qual foi a velocidade media?(Km/h):");
vmedia = s.nextFloat();

dist = t * vmedia;
litcomb = dist / 12;

System.out.println("o tempo da viagem foi " +t+"horas");
System.out.println("A velocidade media foi de " +vmedia+"Km" );
System.out.println("A distancia percorrida na viagem foi de " +dist+"km");
System.out.println("Foram usados " +litcomb+" litros de combustivel");
}
}
