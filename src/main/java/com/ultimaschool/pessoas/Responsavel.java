package com.ultimaschool.pessoas;

import java.lang.reflect.Array;

public class Responsavel extends Pessoa{
    private boolean[]pagamentos = new boolean[12];

    public Responsavel(String nome) {
        super(nome);
    }

    public boolean[] getPagamentos() {
        return pagamentos;
    }

    public void setPagamentos(boolean[] pagamentos) {
        this.pagamentos = pagamentos;
    }

    public boolean pagarMensalidade(int mes, boolean situacao){
        //todo implementor
        return false;
    }

    @Override
    public String verSituacao(int mes) {
        //todo implementor
        return null;
    }

    @Override
    public String relatorio() {
        //todo implementor
        return null;
    }
}
