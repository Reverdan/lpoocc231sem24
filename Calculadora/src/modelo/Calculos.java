package modelo;

public class Calculos
{
    
    public Integer Calcular(Integer n1, Integer n2, String op)
    {
        if (op.equals("+")) return n1 + n2;
        if (op.equals("-")) return n1 - n2;
        if (op.equals("*")) return n1 * n2;
        if (op.equals("/")) return n1 / n2;
        return 0;
    }
}
