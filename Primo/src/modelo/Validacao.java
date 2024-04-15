package modelo;

public class Validacao
{
    private String numero;
    private int num;
    private String mensagem;

    public Validacao(String numero)
    {
        this.numero = numero;
        this.Executar();
    }
    
    private void Executar()
    {
        this.mensagem = "";
        try
        {
            this.num = Integer.parseInt(numero);
        }
        catch (Exception e)
        {
            this.mensagem = "Erro de conversão";
        }
    }

    public int getNum()
    {
        return num;
    }

    public String getMensagem()
    {
        return mensagem;
    }
    
    
}
