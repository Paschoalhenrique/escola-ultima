package com.ultimaschool.pessoas;

public class Estudante extends Pessoa{

    private String matricula;
    private double[] notas = new double[4];

    public Estudante(String nome) {
        super(nome);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;


    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public void consoldarNota(int unidade, double nota){
       //todo implementor

   }
   public double calcularMediaFinal(){
       //todo implementor
       return 0.0;
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
