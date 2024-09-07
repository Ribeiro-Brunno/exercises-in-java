package br.com.cotemig.webreqres_primeiro_projeto.model;

public class Formacao {

    private String instituicao;
    private String curso;
    private Integer cargaHoraria;

    public Formacao(String instituicao, String curso, Integer cargaHoraria) {
        this.instituicao = instituicao;
        this.curso = curso;
        this.cargaHoraria = cargaHoraria;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}
