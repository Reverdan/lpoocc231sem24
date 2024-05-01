package modelo;

public class Validacao extends AbsPropriedades
{
    public Validacao(String numero)
    {
        super(numero);
    }

    @Override
    public void Executar()
    {
        Estaticos.MENSAGEM = "";
        try
        {
            this.num = Integer.parseInt(this.numero);
        }
        catch (Exception e)
        {
            Estaticos.MENSAGEM = "Digite números válidos";
        }
    }
    
}
