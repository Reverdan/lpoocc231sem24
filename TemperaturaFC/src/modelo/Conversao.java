package modelo;

import java.text.DecimalFormat;

public class Conversao extends AbsPropriedades
{

    public Conversao(Double temp, String tipo)
    {
        super(temp, tipo);
    }

    @Override
    public void Executar()
    {
        if (tipo.equals("CF"))
        {
            this.temperatura = String.format("%.2f", temp * 1.8 + 32);
        }
        else
        {
            //this.temperatura = String.valueOf((temp - 32) / 1.8);
            DecimalFormat df = new DecimalFormat("#.00");
            this.temperatura = df.format((temp - 32) / 1.8);
        }
    }
    
}
