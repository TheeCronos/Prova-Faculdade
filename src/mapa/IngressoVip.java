package mapa;

public class IngressoVip extends Ingresso{

    private float valorFinal;
    private float percent;
    
    public IngressoVip(String nome, String cpf, Evento eventoRelacionado) {
        super.setNome(nome);
        super.setCpf(cpf);
        super.setEventoRelacionado(eventoRelacionado);
    }
    
    public void imprimirValor() {
        System.out.println("Tipo de ingresso: Vip - Valor: " + calcularValorIngresso());
    }
    
    @Override
    public Float calcularValorIngresso() {
        percent = super.getEventoRelacionado().getValorUnico() * 0.3f;
        valorFinal = super.getEventoRelacionado().getValorUnico() + percent;
        return valorFinal;
    }
}
