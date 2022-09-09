package main;

public class Main {

    public static void main(String[] args) {
        clima c = new climaBuilder().
                setRegiao("Nordeste").
                setEstado("Paraíba").
                setCidade("Cajazeiras").
                setTemperatura(30).
                setChuva(0).
                setUmidade(33).
                setVento(23).
                setCeu("Ensolarado").
                buildClima();
        System.out.println(c);
    }
}
