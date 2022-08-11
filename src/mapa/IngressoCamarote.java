package mapa;

public class IngressoCamarote extends Ingresso{

    private float valorFinal;
    private float percent;
    
    public IngressoCamarote(String nome, String cpf, Evento eventoRelacionado) {
        super.setNome(nome);
        super.setCpf(cpf);
        super.setEventoRelacionado(eventoRelacionado);
    }
    
    @Override
    public Float calcularValorIngresso() {
        percent = super.getEventoRelacionado().getValorUnico() * 0.6f;
        valorFinal = super.getEventoRelacionado().getValorUnico() + percent;
        return valorFinal;
    }
}
