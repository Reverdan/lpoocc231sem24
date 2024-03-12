package modelo;

public class Validacao
{
    public String num1;
    public String num2;
    public Integer n1;
    public Integer n2;
    public String mensagem;
    
    public void validar()
    {
        mensagem = ""; 
        try
        {
            n1 = Integer.parseInt(num1);
            n2 = Integer.parseInt(num2);
        }
        catch (Exception e)
        {
            mensagem = "Digite números válidos";
        }
    }
}
