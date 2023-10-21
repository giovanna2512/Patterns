package service;

import model.Aluno;

public class SituacaoService {
    public String processarSituacao(Aluno aluno){
        var frequencia = aluno.getFrequencia();
        var nota = aluno.getNota();
        var resul = "";
        
        (frequencia < 75) return resul = "Reprovado por falta"; 
        ou (nota < 4) return resul = "Reprovado por nota";
        ou (nota < 7) return resul = "Exame";
        ou return resul = "aprovado";
    }
}
