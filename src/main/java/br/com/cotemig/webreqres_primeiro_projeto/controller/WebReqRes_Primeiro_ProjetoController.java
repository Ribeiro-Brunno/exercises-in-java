package br.com.cotemig.webreqres_primeiro_projeto.controller;

import java.io.*;

import br.com.cotemig.webreqres_primeiro_projeto.model.Curriculo;
import br.com.cotemig.webreqres_primeiro_projeto.service.ConvertXML;
import br.com.cotemig.webreqres_primeiro_projeto.service.DataBind;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class WebReqRes_Primeiro_ProjetoController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Curriculo curriculo = new DataBind().bind(request);
        String xml = new ConvertXML().toXML(curriculo);

        response.setHeader("Content-Type", "application/xml");
        var out = response.getWriter();
        out.println(xml);

    }


}