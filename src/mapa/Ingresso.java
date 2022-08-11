package mapa;

public abstract class Ingresso {
    
    private String nome;
    private String cpf;
    private Evento eventoRelacionado;
    
    public abstract Float calcularValorIngresso();
    
    public void mostrarResumo() {
        System.out.println("Nome: " + nome
                        + " - CPF: " + cpf
                        + " - Nome do Evento: " + getEventoRelacionado().getNome()
                        + " - Data do Evento: " + getEventoRelacionado().getData());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Evento getEventoRelacionado() {
        return eventoRelacionado;
    }

    public void setEventoRelacionado(Evento eventoRelacionado) {
        this.eventoRelacionado = eventoRelacionado;
    }
}
