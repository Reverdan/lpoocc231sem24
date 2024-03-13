package modelo;

public class Calculos
{
   public Integer n1 = 0;
   public Integer n2 = 0;
   public String op = ""; 
   public Integer resultado = 0;
   
   public void calcular()
   {
       if (op.equals("+"))
               resultado = n1 + n2;
       if (op.equals("-"))
               resultado = n1 - n2;
       if (op.equals("*"))
               resultado = n1 * n2;
       if (op.equals("/"))
               resultado = n1 / n2;
   } 

}
