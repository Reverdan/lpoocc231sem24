package modelo;

public class Controle
{
    public String num1;
    public String num2;
    public String mensagem;
    public String resposta;
    public String op;
    
    public void executar()
    {
        this.mensagem = "";
        Validacao validacao = new Validacao();
        validacao.num1 = this.num1;
        validacao.num2 = this.num2;
        validacao.op = this.op;
        validacao.validar();
        if (validacao.mensagem.equals(""))
        {
            Calculos calculos = new Calculos();
            calculos.n1 = validacao.n1;
            calculos.n2 = validacao.n2;
            calculos.op = this.op;
            calculos.calcular();
            this.resposta = calculos.resultado.toString();
        }
        else
        {
            this.mensagem = validacao.mensagem;
        }
    }
}
