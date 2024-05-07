package modelo;

public class ControleFatorial extends AbsPropriedades
{

    public ControleFatorial(String numero)
    {
        super(numero);
    }

    @Override
    public void Executar()
    {
        AbsPropriedades validacao = new ValidacaoFatorial(this.numero);
        if (Estaticos.MENSAGEM.equals(""))
        {
            AbsPropriedades calculoFatorial = 
                    new CalculoFatorial(validacao.num);
            this.resposta = calculoFatorial.toString();
        }
    }
}
