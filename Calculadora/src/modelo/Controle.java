package modelo;

public class Controle
{
    public String mensagem; 
    public String resultado;
    
    public void Executar(String num1, String num2, String op)
    {
        this.mensagem = "";
        Validacao validacao = new Validacao();
        validacao.Validar(num1, num2, op);
        if (validacao.mensagem.equals(""))
        {
            Calculos calculos = new Calculos();
            this.resultado = calculos.Calcular(validacao.n1, validacao.n2, op).toString();
        }
        else
        {
            this.mensagem = validacao.mensagem;
        }
    }
}
