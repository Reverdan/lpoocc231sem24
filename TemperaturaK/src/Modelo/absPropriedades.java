package Modelo;

public abstract class absPropriedades implements IMetodos
{
    public String temperatura;
    public Double valor;
    public String resposta;
    
    public absPropriedades(String temperatura)
    {
        this.temperatura = temperatura;
        this.Executar();
    }

    public absPropriedades(Double valor)
    {
        this.valor = valor;
        this.Executar();
    }
    
    @Override
    public String toString()
    {
        return resposta;
    }
}
