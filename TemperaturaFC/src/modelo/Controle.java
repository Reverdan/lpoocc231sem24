package modelo;

public class Controle extends AbsPropriedades
{

    public Controle(String temperatura, String tipo)
    {
        super(temperatura, tipo);
    }

    @Override
    public void Executar()
    {
        AbsPropriedades validacao = new Validacao(this.temperatura);
        if (Estaticos.MENSAGEM.equals(""))
        {
            AbsPropriedades conversao = new Conversao(validacao.temp, this.tipo);
            this.temperatura = conversao.toString();
        }
    }
    
}
