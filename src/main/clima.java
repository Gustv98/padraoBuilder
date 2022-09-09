package main;

public class clima {
    private String regiao;
    private String estado;
    private String cidade;
    private int temperatura;
    private int chuva;
    private int umidade;
    private int vento;
    private String ceu;

    public clima( String regiao, String estado, String cidade, int temperatura, int chuva, int umidade, int vento, String ceu) {
        this.regiao = regiao;
        this.estado = estado;
        this.cidade = cidade;
        this.temperatura = temperatura;
        this.chuva = chuva;
        this.umidade = umidade;
        this.vento = vento;
        this.ceu = ceu;

    }


    @Override
    public String toString() {
        return "Clima:" +
                "Regiao='" + regiao + '\'' +
                ", Estado='" + estado + '\'' +
                ", Cidade='" + cidade + '\'' +
                ", Temperatura=" + temperatura + "°C" +
                ", Chuva=" + chuva + "%" +
                ", Umidade=" + umidade + "%" +
                ", Vento=" + vento + "KM" +
                ", Ceu='" + ceu + '\'' +
                '.';
    }
}
