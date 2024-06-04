package com.ultimaschool.pessoas;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Responsavel extends Pessoa {
    private boolean[] pagamentos = new boolean[12];

    public Responsavel(String nome) {
        super(nome);
    }

    public boolean[] getPagamentos() {
        return pagamentos;
    }

    public void setPagamentos(boolean[] pagamentos) {
        this.pagamentos = pagamentos;
    }

    public boolean pagarMensalidade(int mes, boolean situacao) {
        pagamentos[mes] = situacao;
        return situacao;
    }

    @Override
    public String verSituacao(int mes) {
        if (getPagamentos()[mes]) {
            return "O pagamento foi realizado no mês " + mes;
        }
        return "O pagamnento não foi realizado no mês " + mes;
    }
    private String converteListaEmString(ArrayList<Integer> lista){
        String resultado = " ";
        for (int l : lista){
            resultado += l + " , ";

        }
        return resultado;
    }


    private String mesesComPagamento() {
        ArrayList<Integer> listaMesesPagos = new ArrayList<Integer>();
        for (int mes = 1; mes < pagamentos.length; mes++) {
            if (pagamentos[mes]) {
                listaMesesPagos.add(mes);
            }
        }
        return " Os meses com pagamento foram: "  + " 1, 2, 4";
    }
        @Override
        public String relatorio () {
            return " O responsavel financeiro " + getNome() + " realizou o pagamento " + mesesComPagamento();
        }
    }
