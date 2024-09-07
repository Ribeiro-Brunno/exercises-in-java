package br.com.cotemig.webreqres_primeiro_projeto.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Curriculo {

    private String nome;
    private String sexo;
    private String email;
    private String telefone;
    private String linkedin;

    private List<Formacao> formacoes = new ArrayList<>();
    private List<Experiencia> experiencias = new ArrayList<>();

    public Curriculo(String nome, String sexo, String email, String telefone, String linkedin, Formacao formacao, Experiencia experiencia) {
        this.nome = nome;
        this.sexo = sexo;
        this.email = email;
        this.telefone = telefone;
        this.linkedin = linkedin;
        this.formacoes.add(formacao);
        this.experiencias.add(experiencia);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public void addFormacao(Formacao formacao) {
        if (this.formacoes.size() < 2) {
            this.formacoes.add(formacao);
        }
    }

    public void addExperiencia(Experiencia experiencia) {
        if (this.experiencias.size() < 2) {
            this.experiencias.add(experiencia);
        }
    }

    public List<Formacao> getFormacoes() {
        return Collections.unmodifiableList(this.formacoes);
    }

    public List<Experiencia> getExperiencias() {
        return Collections.unmodifiableList(this.experiencias);
    }

}
