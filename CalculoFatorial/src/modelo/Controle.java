package modelo;

public class Controle extends AbsPropriedades
{

    public Controle(String numero)
    {
        super(numero);
    }

    @Override
    public void Executar()
    {
        Estaticos.MENSAGEM = "";
        //Validacao validacao = new Validacao(this.numero);
        AbsPropriedades validacao = new Validacao(this.numero);
        if (Estaticos.MENSAGEM.equals(""))
        {
            AbsPropriedades calculoFatorial = 
                    new CalculoFatorial(validacao.num);
            this.numero = calculoFatorial.toString();
        }
    }

    @Override
    public String toString()
    {
        return this.numero;
    }
    
    
}
