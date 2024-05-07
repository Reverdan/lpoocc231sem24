package modelo;

public abstract class AbsPropriedades implements IMetodos
{
    public String numero;
    public Integer num;
    public String lado1;
    public String lado2;
    public String lado3;
    public Double l1;
    public Double l2;
    public Double l3;
    public String resposta;

    public AbsPropriedades(String numero)
    {
        this.numero = numero;
        this.Executar();
    }

    public AbsPropriedades(Integer num)
    {
        this.num = num;
        this.Executar();
    }

    public AbsPropriedades(String lado1, String lado2, String lado3)
    {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.Executar();
    }

    public AbsPropriedades(Double l1, Double l2, Double l3)
    {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
        this.Executar();
    }

    @Override
    public String toString()
    {
        return resposta;
    }
}
