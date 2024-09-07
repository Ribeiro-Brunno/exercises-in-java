package br.com.cotemig.webreqres_primeiro_projeto.model;

public class Experiencia {

    private String empresa;
    private String cargo;
    private String nivel;
    private String descricao;

    public Experiencia(String empresa, String cargo, String nivel, String descricao) {
        this.empresa = empresa;
        this.cargo = cargo;
        this.nivel = nivel;
        this.descricao = descricao;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
