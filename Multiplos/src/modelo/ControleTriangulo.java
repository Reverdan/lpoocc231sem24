package modelo;

public class ControleTriangulo extends AbsPropriedades
{

    public ControleTriangulo(String lado1, String lado2, String lado3)
    {
        super(lado1, lado2, lado3);
    }

    @Override
    public void Executar()
    {
        AbsPropriedades validacao = new ValidacaoTriangulo(lado1, lado2, lado3);
        if (Estaticos.MENSAGEM.equals(""))
        {
            AbsPropriedades triangulos = new Triangulos(validacao.l1,
                    validacao.l2, validacao.l3);
            this.resposta = triangulos.toString();
        }
    }
    
}
