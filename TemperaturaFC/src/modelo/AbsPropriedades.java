package modelo;

public abstract class AbsPropriedades implements IMetodos
{
    public Double temp;
    public String temperatura;
    public String tipo;

    public AbsPropriedades(Double temp, String tipo)
    {
        this.temp = temp;
        this.tipo = tipo;
        this.Executar();
    }

    public AbsPropriedades(String temperatura, String tipo)
    {
        this.temperatura = temperatura;
        this.tipo = tipo;
        this.Executar();
    }

    public AbsPropriedades(String temperatura)
    {
        this.temperatura = temperatura;
        this.Executar();
    }

    @Override
    public String toString()
    {
        return temperatura;
    }
    
    
    
}
