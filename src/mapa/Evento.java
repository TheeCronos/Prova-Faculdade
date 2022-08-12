package mapa;

import java.util.ArrayList;
import java.util.List;

public class Evento {
    
    private String nome;
    private String data;
    private float valorUnico;
    private int capacidadeMax;
    private List<Ingresso> listaIngressos;
    private List<Ingresso> ingressosVendidos;

    public Evento() {
        this.listaIngressos = new ArrayList<Ingresso>();
        this.ingressosVendidos = new ArrayList<Ingresso>();
    }

    public Evento(String nome, String data, float valorUnico, int capacidadeMax) {
        this.nome = nome;
        this.data = data;
        this.valorUnico = valorUnico;
        this.capacidadeMax = capacidadeMax;
        this.listaIngressos = new ArrayList<Ingresso>();
        this.ingressosVendidos = new ArrayList<Ingresso>();
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

    public List<Ingresso> getListaIngressos() {
        return listaIngressos;
    }

    public void setListaIngressos(List<Ingresso> listaIngressos) {
        this.listaIngressos = listaIngressos;
    }
    
    public void addIngressos(Ingresso listaIngresso){
        if (this.listaIngressos.size() < capacidadeMax) {
            listaIngressos.add(listaIngresso);
            return;
        } 
        System.out.println("Capacidade máxima atingida!");
    }
    
    public void listarIng() {
        listaIngressos.forEach(ingresso -> {
            System.out.print(ingresso.getClass().getSimpleName());
            System.out.print(" - Nome: " + ingresso.getNome());
            System.out.print(" - CPF: " + ingresso.getCpf());
            System.out.println(" - Evento: " + ingresso.getEventoRelacionado().nome);
        });
    }
    
    public void venderIngresso(Ingresso ingresso){  
        
        if (listaIngressos.contains(ingresso)) {
            this.ingressosVendidos.add(ingresso);
            return;
        }
        System.out.println("Ingresso não pode ser vendido!");
    }
    
    public int qtdIngressosVendidos() {
        System.out.println("");
        return this.ingressosVendidos.size();
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " - Data: " + data + " - Valor Único: " + valorUnico + " - Capacidade Max: " + capacidadeMax;
    }
}