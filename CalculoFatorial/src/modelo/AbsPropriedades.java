package modelo;

public abstract class AbsPropriedades implements IMetodos
{
    protected String numero;
    protected Integer num;

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
    
    
}
