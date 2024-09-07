<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!doctype html>
<html lang="pt-br">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Meu primeiro formulário</title>
  <style>
    section, fieldset{
      margin-bottom: 8px;
    }
  </style>
</head>
<body>
  <form action="./hello-servlet" method="post">
    <fieldset>
      <legend>Dados Pessoais</legend>
      <section>
        <label for="nome">Nome Completo</label>
        <input type="text" id="nome" name="nome" required>
      </section>

      <section>
        <label>Sexo</label>
        <input type="radio" id="sexo-masculino" name="sexo" value="M" checked>Masculino
        <input type="radio" id="sexo-feminino" name="sexo" value="F" >Feminino
      </section>

      <section>
        <label for="email">E-mail</label>
        <input type="email" id="email" name="email" value="" required>
      </section>

      <section>
        <label for="telphone">Telefone</label>
        <input type="tel" id="telphone" name="telphone" value="" required>
      </section>

      <section>
        <label for="linkedin"></label>
        <input type="url" id="linkedin" name="linkedin" value="" required>
      </section>
    </fieldset>

    <fieldset>
      <legend>Formação Acadêmica</legend>
      <section id="formacao1">
        <section>
          <label for="formacao1-instituicao">Instituição</label>
          <input type="text" id="formacao1-instituicao" name="formacao1-instituicao" value="" required>
        </section>

        <section>
          <label for="formacao1-curso">Curso</label>
          <input type="text" id="formacao1-curso" name="formacao1-curso" value="" required >
        </section>

        <section>
          <label for="formacao1-carga-horaria">Carga Horária</label>
          <input type="number" id="formacao1-carga-horaria" name="formacao1-carga-horaria" value="" required>
        </section>
      </section>

      <hr>

      <section id="formacao2">
        <section>
          <label for="formacao2-instituicao">Instituição</label>
          <input type="text" id="formacao2-instituicao" name="formacao2-instituicao" value="">
        </section>

        <section>
          <label for="formacao2-curso">Curso</label>
          <input type="number" id="formacao2-curso" name="formacao2-curso" value="">
        </section>

        <section>
          <label for="formacao2-carga-horaria">Carga Horária</label>
          <input type="number" id="formacao2-carga-horaria" name="formacao2-carga-horaria" value="">
        </section>
      </section>
    </fieldset>

    <fieldset>
      <legend>Experiência Profissional</legend>
      <section>
        <section id="experiencia1">
          <section>
            <label for="experiencia1-empresa">Empresa</label>
            <input type="text" id="experiencia1-empresa" name="experiencia1-empresa" value="" required>
          </section>

          <section>
            <label for="experiencia1-cargo">Cargo</label>
            <input type="text" id="experiencia1-cargo" name="experiencia1-cargo" value="" required>
          </section>

          <section>
            <label for="experiencia1-nivel">Nível</label>
            <select id="experiencia1-nivel" name="experiencia1-nivel" required>
              <option value=""></option>
              <option value="j">Junior</option>
              <option value="p">Pleno</option>
              <option value="S">Sênior</option>
            </select>
          </section>

          <section>
            <label for="experiencia1-descricao" >Descrição das Atividades</label>
            <textarea id="experiencia1-descricao" name="experiencia1-descricao" rows="5" cols="50"></textarea>
          </section>
        </section>
      </section>

      <hr>

      <section>
        <section id="experiencia2">
          <section>
            <label for="experiencia2-empresa">Empresa</label>
            <input type="text" id="experiencia2-empresa" name="experiencia2-empresa" value="">
          </section>

          <section>
            <label for="experiencia2-cargo">Cargo</label>
            <input type="text" id="experiencia2-cargo" name="experiencia2-cargo" value="">
          </section>

          <section>
            <label for="experiencia2-nivel">Nível</label>
            <select id="experiencia2-nivel" name="experiencia2-nivel">
              <option value=""></option>
              <option value="j">Junior</option>
              <option value="p">Pleno</option>
              <option value="S">Sênior</option>
            </select>
          </section>

          <section>
            <label for="experiencia2-descricao" >Descrição das Atividades</label>
            <textarea id="experiencia2-descricao" name="experiencia2-descricao" rows="5" cols="50"></textarea>
          </section>
        </section>
      </section>
    </fieldset>

    <fieldset>
      <section>
        <button type="submit">Enviar Dados</button>
      </section>
    </fieldset>
  </form>
</body>
</html>