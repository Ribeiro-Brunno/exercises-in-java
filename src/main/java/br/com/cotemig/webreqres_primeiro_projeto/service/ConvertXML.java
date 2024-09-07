package br.com.cotemig.webreqres_primeiro_projeto.service;

import br.com.cotemig.webreqres_primeiro_projeto.model.Curriculo;

public class ConvertXML {

    public String toXML(Curriculo curriculo) {
        StringBuilder xml = new StringBuilder();
        xml.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
        xml.append("<curriculo>\n");
        xml.append("    <dados_pessoais>\n");
        xml.append("        <nome>" + curriculo.getNome() + "</nome>\n");
        xml.append("        <sexo>" + curriculo.getSexo() + "</sexo>\n");
        xml.append("        <email>" + curriculo.getEmail() + "</email>\n");
        xml.append("        <telefone>" + curriculo.getTelefone() + "</telefone>\n");
        xml.append("        <linkedin>" + curriculo.getLinkedin() + "</linkedin>\n");
        xml.append("    </dados_pessoais>\n");
        xml.append("    <formacoes>\n");
        for (int i = 0; i < curriculo.getFormacoes().size(); i++) {
            var formacao = curriculo.getFormacoes().get(i);
            xml.append("    <formacao>\n");
            xml.append("        <instituicao>" + formacao.getInstituicao() + "</instituicao>\n");
            xml.append("        <curso>" + formacao.getCurso() + "</curso>\n");
            xml.append("        <carga_horario>" + formacao.getCargaHoraria() + "</carga_horario>\n");
            xml.append("    </formacao>\n");
        }
        xml.append("    </formacoes>\n");
        xml.append("    <experiencias>\n");
        for (int i = 0; i < curriculo.getExperiencias().size(); i++) {
            var experiencia = curriculo.getExperiencias().get(i);
            xml.append("    <experiencia>\n");
            xml.append("        <empresa>" + experiencia.getEmpresa() + "</empresa>\n");
            xml.append("        <cargo>" + experiencia.getCargo() + "</cargo>\n");
            xml.append("        <nivel>" + experiencia.getNivel() + "</nivel>\n");
            xml.append("        <descricao>" + experiencia.getDescricao() + "</descricao>\n");
            xml.append("    </experiencia>\n");
        }
        xml.append("    </experiencias>\n");
        xml.append("</curriculo>\n");

        return xml.toString();
    }

}
