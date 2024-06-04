package com.ultimaschool;

import com.ultimaschool.pessoas.Estudante;
import com.ultimaschool.pessoas.Responsavel;

public class App {
    public static void main(String[] args) {
        //System.out.println("teste escola");
        Estudante estudante = new Estudante("Paschoal Henrique");
       // Responsavel responsavel = new Responsavel("Fernanda Dutra");

        estudante.consoldarNota(1, 6.0);
        estudante.consoldarNota(2, 9.0);
        estudante.consoldarNota(3, 7.0);
        estudante.consoldarNota(4, 8.0);

        System.out.println(estudante.relatorio());
        System.out.println(estudante.verSituacao(5));


        Responsavel responsavel = new Responsavel("Paschoal Henrique ");
        responsavel.pagarMensalidade(1, true);
        responsavel.pagarMensalidade(2, true);
        responsavel.pagarMensalidade(3, false);
        responsavel.pagarMensalidade(4, true);
        responsavel.pagarMensalidade(5, false);

        System.out.println(responsavel.relatorio());
        System.out.println(responsavel.verSituacao(1));
        System.out.println(responsavel.verSituacao(3));

    }
}