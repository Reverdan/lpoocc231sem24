package modelo;

public final class Primo extends AbsPropriedades
{
    public Primo(int num)
    {
        this.num = num;
        this.Executar();
    }

    private void Executar()
    {
        this.resposta = "É primo";
        if (num <= 1)
        {
            this.resposta = "Não é primo";
            return;
        }
        for (int i = 2; i <= this.num / 2 + 1; i++)
        {
            if (num % i == 0)
            {
                this.resposta = "Não é primo";
                break;
            }
        }
    }

}
