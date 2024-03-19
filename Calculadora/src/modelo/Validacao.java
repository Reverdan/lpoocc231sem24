package modelo;

public class Validacao
{
    public String num1;
    public String num2;
    public String op;
    public String mensagem;
    public int n1;
    public int n2;
    
    public void Validar()
    {
        this.mensagem = "";
        try
        {
            this.n1 = Integer.parseInt(this.num1);
            this.n2 = Integer.parseInt(this.num2);
            if (this.op.equals("/") && this.n2 == 0)
                this.mensagem = "Divisão por zero";
        }
        catch (NumberFormatException e)
        {
            this.mensagem = "Digite números válidos";
        }
    }
}
