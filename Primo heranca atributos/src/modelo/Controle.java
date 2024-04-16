package modelo;

public final class Controle extends AbsPropriedades
{
    public Controle(String numero)
    {
        this.numero = numero;
        this.Executar();
    }
    
    private void Executar()
    {
        this.mensagem = "";
        Validacao validacao = new Validacao(numero);
        if (validacao.mensagem.equals(""))
        {
            Primo primo = new Primo(validacao.num);
            this.resposta = primo.resposta;
        }
        else
        {
            this.mensagem = validacao.mensagem;
        }
    }

    
}
