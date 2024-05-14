package modelo;

public class Validacao extends AbsPropriedades
{

    public Validacao(String temperatura)
    {
        super(temperatura);
    }

    @Override
    public void Executar()
    {
        Estaticos.MENSAGEM = "";
        try
        {
            this.temp = Double.parseDouble(this.temperatura);
        }
        catch (Exception e)
        {
            Estaticos.MENSAGEM = "Valor inválido";
        }
    }
    
}
