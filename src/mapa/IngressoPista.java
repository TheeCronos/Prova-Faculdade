package mapa;

public class IngressoPista extends Ingresso{

    public IngressoPista(String nome, String cpf, Evento eventoRelacionado) {
        super.setNome(nome);
        super.setCpf(cpf);
        super.setEventoRelacionado(eventoRelacionado);
    }
    
    public void imprimirValor() {
        System.out.println("Tipo de ingresso: Pista - Valor: " + calcularValorIngresso());
    }
    
    @Override
    public Float calcularValorIngresso() {
        return super.getEventoRelacionado().getValorUnico();
    }
}
