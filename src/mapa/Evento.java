package mapa;

public class Evento {
    
    private String nome;
    private String data;
    private float valorUnico;
    private int capacidadeMax;
    private String listaIngressos;

    public Evento() {
        
    }

    public Evento(String nome, String data, float valorUnico, int capacidadeMax, String listaIngressos) {
        this.nome = nome;
        this.data = data;
        this.valorUnico = valorUnico;
        this.capacidadeMax = capacidadeMax;
        this.listaIngressos = listaIngressos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public float getValorUnico() {
        return valorUnico;
    }

    public void setValorUnico(float valorUnico) {
        this.valorUnico = valorUnico;
    }

    public int getCapacidadeMax() {
        return capacidadeMax;
    }

    public void setCapacidadeMax(int capacidadeMax) {
        this.capacidadeMax = capacidadeMax;
    }

    public String getListaIngressos() {
        return listaIngressos;
    }

    public void setListaIngressos(String listaIngressos) {
        this.listaIngressos = listaIngressos;
    }

    @Override
    public String toString() {
        return "Evento: " + nome 
                + " - Data: " + data 
                + " - Valor Único: " + valorUnico 
                + " - Capacidade Máxima: " + capacidadeMax 
                + " - Lista Ingressos: " + listaIngressos;
    }

    
}