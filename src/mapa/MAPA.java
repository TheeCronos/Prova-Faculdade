package mapa;

import java.util.Scanner;

public class MAPA {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        //-------------------- Eventos ----------------------//
        Evento e1 = new Evento("Rock in Rio", "08/10/2022", 100.00f, 2);        
        System.out.println(e1);
        
        Evento e2 = new Evento("Halloween", "31/10/2022", 150.00f, 100);
        System.out.println(e2);
        
        Evento e3 = new Evento("Natal", "24/12/2022", 10.00f, 20);
        System.out.println(e3);
        
        //-------------------- Ingressos ---------------------//
        Ingresso a1 = new IngressoPista("a", "12345", e1);
        a1.mostrarResumo();
        a1.imprimirValor();

        Ingresso a2 = new IngressoVip("b", "54321", e1);
        a2.mostrarResumo();
        a2.imprimirValor();

        Ingresso a3 = new IngressoCamarote("c", "11111", e1);
        a3.mostrarResumo();
        a3.imprimirValor();
        
        //------------------ Adiciona ingresso ---------------//
        e1.addIngressos(a1);
        e1.addIngressos(a2);
        e1.addIngressos(a3);        
        System.out.println("");
        
        //------------------ Lista Ingressos -----------------//
        e1.listarIng();
        
        //------------------ Vender Ingressos ----------------//
        e1.venderIngresso(a1);
        e1.venderIngresso(a2);
        e1.venderIngresso(a3);
        
        System.out.println("Total de ingressos vendidos: " + e1.qtdIngressosVendidos());
    }
}
