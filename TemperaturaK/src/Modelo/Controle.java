package Modelo;

public class Controle extends absPropriedades
{

    public Controle(String temperatura)
    {
        super(temperatura);
    }

    @Override
    public void Executar()
    {
        absPropriedades validacao = new Validacao(this.temperatura);
        if (Estaticos.MENSAGEM.equals(""))
        {
            absPropriedades kelvin = new Kelvin(validacao.valor);
            this.resposta = kelvin.toString();
        }
    }

    
}
