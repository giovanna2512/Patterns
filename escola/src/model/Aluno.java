package model;

public class Aluno {

    private int id;
    private String nome;
    private String turma;
    private double nota;
    private int frequencia;

    public Aluno nome (String nome) {
        this.nome = nome;
        return this;
    }

    public Aluno turma (String turma) {
        this.turma = turma;
        return this;
    }

    public Aluno nota (double nota) {
        this.nota = nota;
        return this;
    }

    public Aluno frequencia (int frequencia) {
        this.frequencia = frequencia;
        return this;
    }
    @Override
    public String toString(){
        return "Aluno [nome=" +nome+ ",turma "+turma+" nota" +nota+ " frequencia"+frequencia+"]";
    }


    public int getFrequencia() {
        return frequencia;
    }
    public void setFrequencia(int frequencia) {
        this.frequencia = frequencia;
    }
    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public String getTurma() {
        return turma;
    }
    public double getNota() {
        return nota;
    }
    public void setNota(double nota) {
        this.nota = nota;
    }

}
