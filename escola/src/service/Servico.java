package service;

public abstract class Servico {
    private Aluno aluno;

    public Servico(Aluno aluno){
        this.aluno =aluno;
    }

    public abstract double nota();


    public Servico ou (Servico proximo){
        if (aplicarServico())
        return this;
        return proximo;
    }

    public abstract boolean aplicarServico();
}
