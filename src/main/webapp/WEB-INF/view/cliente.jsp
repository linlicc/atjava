<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<body>
<div>
    <form action="/cliente" method="post">

        <div style="width: 100%; align-items: center; display: flex; flex-direction: column;">
            <h1>Dados do usuario</h1>

            <div style="display: flex; flex-direction: column;">
            <span>
                <label>Nome do usuario:</label>
                <input type="text" name="nome" id="nome" required>
            </span>
                <span>
                <label>Senha:</label>
                <input type="password" name="senha" id="senha" required>
            </span>
                <button style="width: 300px; margin-top: 10px;" type="submit">Salvar</button>
                <br/>
                <a href="/">Retornar</a>
            </div>
        </div>

        <c:if test="${not empty clientes}">
            <hr/>
            <div style="width: 100%; align-items: center; display: flex; flex-direction: column;">
                <table>
                    <thead>
                    <tr>
                        <th>Id</th>
                        <th>Nome</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="u" items="${clientes}">
                        <tr>
                            <td>${u.id}</td>
                            <td>${u.nome}</td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </c:if>

    </form>



</div>
</body>
</html>
