package mapa;

public abstract class Ingresso {
    
    private String nome;
    private String cpf;
    private Evento eventoRelacionado;
    
    public abstract Float calcularValorIngresso();
    
    public abstract void imprimirValor();
    
    public void mostrarResumo() {
        System.out.println("");
        System.out.println("Resumo = "
                        + " Dono do ingresso: " + nome
                        + " - CPF: " + cpf
                        + " - Evento: " + getEventoRelacionado().getNome()
                        + " - Data: " + getEventoRelacionado().getData());
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
    
    @Override
    public String toString() {
        return "Nome: " + nome + " - CPF: " + cpf + " - Evento Relacionado: " + eventoRelacionado;
    }
}
