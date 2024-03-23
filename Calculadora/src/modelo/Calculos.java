package modelo;

public class Calculos
{
    private Integer n1;
    private Integer n2;
    private String op;
    private Integer resposta;
    
    public Calculos(int n1, int n2, String op)
    {
        this.n1 = n1;
        this.n2 = n2;
        this.op = op;
        this.Calcular();
    }
    
    public void Calcular()
    {
        if (this.op.equals("+")) this.resposta =  n1 + n2;
        if (this.op.equals("-")) this.resposta =  n1 - n2;
        if (this.op.equals("*")) this.resposta =  n1 * n2;
        if (this.op.equals("/")) this.resposta =  n1 / n2;
    }

    public Integer getResposta()
    {
        return resposta;
    }
    
    
}
