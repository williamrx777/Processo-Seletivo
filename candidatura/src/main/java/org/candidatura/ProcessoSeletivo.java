package org.candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        //analisarCandidato(1900.0);
        //analisarCandidato(2200.0);
        //analisarCandidato(2000.0);
        //selecaoDeCandidatos();
        imprimirSelecionados();
    }

    static void imprimirSelecionados() {
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO","AUGUSTO"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for(int indice=0; indice < candidatos.length; indice++) {
           System.out.println("O candidato de nº " + (indice+1) + " é " + candidatos[indice]);
        }
        System.out.println("Forma abreviada de interação for each");
        for(String candidato : candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }

    static void selecaoDeCandidatos(){
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO","AUGUSTO","MONICA","FABRICIO","MIRELA","DANIELA","JORGE"};

        int candicatosSelecionados = 0;
        int candidatosAtual=0;
        double salarioBase = 2000.0;
        while(candicatosSelecionados < 5 && candidatosAtual < candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println(" O candidato " + candidato + " Solicitou este valor de salario " + salarioPretendido);
            if (salarioBase > salarioPretendido){
                System.out.println(" O candidato " + candidato + " foi selecionado para a vaga ");
                candicatosSelecionados++;
            }else {
                System.out.println(" O candidato " + candidato + " não foi selecionado para a vaga ");
            }
            candidatosAtual++;
        }

    }
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if(salarioBase==salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }else{
            System.out.println("AGUARDANDO DEMAIS CANDIDATOS");
        }
    }
}