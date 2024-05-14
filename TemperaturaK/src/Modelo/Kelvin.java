package Modelo;

public class Kelvin extends absPropriedades
{

    public Kelvin(Double valor)
    {
        super(valor);
    }

    @Override
    public void Executar()
    {
        this.resposta = String.format("%.2f", valor + 273);
    }
}
