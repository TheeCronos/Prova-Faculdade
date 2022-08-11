package mapa;

import java.util.Scanner;

public class MAPA {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        //-------------------- Eventos ----------------------//
        Evento e1 = new Evento();        
        e1.setNome("Rock in Rio");
        e1.setData("08/10/2022");
        e1.setCapacidadeMax(200);
        e1.setValorUnico(100.00f);
        System.out.println(e1);
        
        Evento e2 = new Evento();
        e2.setNome("Halloween");
        e2.setData("31/10/2022");
        e2.setCapacidadeMax(100);
        e2.setValorUnico(150.00f);
        System.out.println(e2);
        
        Evento e3 = new Evento();
        e3.setNome("Natal");
        e3.setData("24/12/2022");
        e3.setCapacidadeMax(20);
        e3.setValorUnico(10.00f);
        System.out.println(e3);
        
        //-------------------- Ingressos --------------------//
        Ingresso a1 = new IngressoPista("a", "a", e1);
        Ingresso a2 = new IngressoVip("b", "b", e1);
        Ingresso a3 = new IngressoCamarote("c", "c", e1);
        
        System.out.println(a1.calcularValorIngresso());
        System.out.println(a2.calcularValorIngresso());
        System.out.println(a3.calcularValorIngresso());
        
        a1.mostrarResumo();
        a2.mostrarResumo();
        a3.mostrarResumo();
        
        Ingresso b1 = new IngressoPista("a", "a", e2);
        Ingresso b2 = new IngressoVip("b", "b", e2);
        Ingresso b3 = new IngressoCamarote("c", "c", e2);
        
        System.out.println(b1.calcularValorIngresso());
        System.out.println(b2.calcularValorIngresso());
        System.out.println(b3.calcularValorIngresso());
        
        b1.mostrarResumo();
        b2.mostrarResumo();
        b3.mostrarResumo();
        
        Ingresso c1 = new IngressoPista("a", "a", e3);
        Ingresso c2 = new IngressoVip("b", "b", e3);
        Ingresso c3 = new IngressoCamarote("c", "c", e3);
        
        System.out.println(c1.calcularValorIngresso());
        System.out.println(c2.calcularValorIngresso());
        System.out.println(c3.calcularValorIngresso());
        
        c1.mostrarResumo();
        c2.mostrarResumo();
        c3.mostrarResumo();
    }
}
