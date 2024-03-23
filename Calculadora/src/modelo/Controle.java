package modelo;

public class Controle
{
    private String mensagem; 
    private String resultado;
    private String num1;
    private String num2;
    private String op;

    public Controle(String num1, String num2, String op)
    {
        this.num1 = num1;
        this.num2 = num2;
        this.op = op;
        this.Executar();
    }
    
    public void Executar()
    {
        this.mensagem = "";
        Validacao validacao = new Validacao(this.num1, this.num2, this.op);
        if (validacao.getMensagem().equals(""))
        {
            Calculos calculos = new Calculos(validacao.getN1(), validacao.getN2(), op);
            this.resultado = calculos.getResposta().toString();
        }
        else
            this.mensagem = validacao.getMensagem();
    }

    public String getMensagem()
    {
        return mensagem;
    }

    public String getResultado()
    {
        return resultado;
    }
    
    
}
