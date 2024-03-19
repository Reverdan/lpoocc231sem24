package modelo;

public class Calculos
{
    public Integer n1;
    public Integer n2;
    public Integer resposta;
    public String op;
    
    public void Calcular()
    {
        if (this.op.equals("+")) resposta = n1 + n2;
        if (this.op.equals("-")) resposta = n1 - n2;
        if (this.op.equals("*")) resposta = n1 * n2;
        if (this.op.equals("/")) resposta = n1 / n2;
    }
}
