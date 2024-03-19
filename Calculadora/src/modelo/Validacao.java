package modelo;

public class Validacao
{
    public String mensagem;
    public int n1;
    public int n2;
    
    public void Validar(String num1, String num2, String op)
    {
        this.mensagem = "";
        try
        {
            this.n1 = Integer.parseInt(num1);
            this.n2 = Integer.parseInt(num2);
            if (op.equals("/") && n2 == 0)
                this.mensagem = "Divisão por zero";
        }
        catch (NumberFormatException e)
        {
            this.mensagem = "Digite números válidos";
        }
    }
}
