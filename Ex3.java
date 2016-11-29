
import java.math.BigDecimal;
import java.math.RoundingMode;
public class Ex3
{

public static void main(String[] args)
  {
    Double piAnterior = 0.0;
    Double precisao = 0.0;
    Double precisaoFinal = 0.0;
    Double pi = 4.0;
    Double denominador = 4.0;
    Double divisor = 3.0;
    Double resultadoInteracao = 0.0;
    Double anterior = 4.0;
    int controle = 0;


  //logica
  while(precisaoFinal != 0.000000001)
    {
      resultadoInteracao = denominador / divisor;
      if(controle % 2 == 0){
            piAnterior = pi;
            pi -= resultadoInteracao;
            }else{
                pi += resultadoInteracao;
        }
      divisor += 2.0;
      controle++;
      precisao = (piAnterior - pi);
      BigDecimal bigPrecisao = new BigDecimal(precisao).setScale(10, RoundingMode.HALF_EVEN);
      precisaoFinal = bigPrecisao.doubleValue();

  }
  System.out.println("-------------------------------------------------------------");
  System.out.println("--- Valor de pi com precisao de 10 casas decimais. ----------");
  System.out.println("--- O valor de pi  --> " + pi + "         --------");
  System.out.println("--- Numero de interacoes --> " + controle + "         -----");
  System.out.println("-------------------------------------------------------------");
}
}
