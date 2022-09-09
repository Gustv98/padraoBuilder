package main;

public class climaBuilder{
    private String regiao;
    private String estado;
    private String cidade;
    private int temperatura;
    private int chuva;
    private int umidade;
    private int vento;
    private String ceu;

    public climaBuilder setRegiao(String regiao) {
        this.regiao = regiao;
        return this;
    }

    public climaBuilder setEstado(String estado) {
        this.estado = estado;
        return this;
    }

    public climaBuilder setCidade(String cidade) {
        this.cidade = cidade;
        return this;
    }

    public climaBuilder setTemperatura(int temperatura) {
        this.temperatura = temperatura;
        return this;
    }

    public climaBuilder setChuva(int chuva) {
        this.chuva = chuva;
        return this;
    }

    public climaBuilder setUmidade(int umidade) {
        this.umidade = umidade;
        return this;
    }

    public climaBuilder setVento(int vento) {
        this.vento = vento;
        return this;
    }

    public climaBuilder setCeu(String ceu) {
        this.ceu = ceu;
        return this;
    }

    public clima buildClima(){
        return new clima (regiao, estado, cidade, temperatura, chuva, umidade, vento, ceu);
    }
}
