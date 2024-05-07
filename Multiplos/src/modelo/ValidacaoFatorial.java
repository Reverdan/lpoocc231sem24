package modelo;

public class ValidacaoFatorial extends AbsPropriedades
{

    public ValidacaoFatorial(String numero)
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
