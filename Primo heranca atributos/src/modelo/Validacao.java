package modelo;

public final class Validacao extends AbsPropriedades
{


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
    
}
