package br.com.cotemig.webreqres_primeiro_projeto.service;

import br.com.cotemig.webreqres_primeiro_projeto.model.Curriculo;
import br.com.cotemig.webreqres_primeiro_projeto.model.Experiencia;
import br.com.cotemig.webreqres_primeiro_projeto.model.Formacao;
import jakarta.servlet.http.HttpServletRequest;

public class DataBind {

    public Curriculo bind(HttpServletRequest request) {

        Formacao formacao = new Formacao(
                request.getParameter("formacao1-instituicao"),
                request.getParameter("formacao1-curso"),
                Integer.parseInt(request.getParameter("formacao1-carga-horaria"))
        );

        Experiencia experiencia = new Experiencia(
                request.getParameter("experiencia1-empresa"),
                request.getParameter("experiencia1-cargo"),
                request.getParameter("experiencia1-nivel"),
                request.getParameter("experiencia1-descricao")

        );

        Curriculo curriculo = new Curriculo(
                request.getParameter("nome"),
                request.getParameter("sexo"),
                request.getParameter("email"),
                request.getParameter("telphone"),
                request.getParameter("linkedin"),
                formacao,
                experiencia
        );

        if (!request.getParameter("formacao2-instituicao").equals("")) {
            formacao = new Formacao(
                    request.getParameter("formacao2-instituicao"),
                    request.getParameter("formacao2-curso"),
                    Integer.parseInt(request.getParameter("formacao2-carga-horaria"))
            );
            curriculo.addFormacao(formacao);
        }

        if (!request.getParameter("experiencia2-empresa").equals("")) {
            experiencia = new Experiencia(
                    request.getParameter("experiencia2-empresa"),
                    request.getParameter("experiencia2-cargo"),
                    request.getParameter("experiencia2-nivel"),
                    request.getParameter("experiencia2-descricao")
            );
            curriculo.addExperiencia(experiencia);
        }

        return curriculo;
    }
}
