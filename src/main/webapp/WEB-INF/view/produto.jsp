<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<body>
<div>
    <form action="/produto" method="post">
        <div style="width: 100%; align-items: center; display: flex; flex-direction: column;">
            <h1>Dados do produto</h1>

            <div style="display: flex; flex-direction: column;">
            <span>
                <label>Nome:</label>
                <input type="text" name="nome" id="nome" required>
            </span>
                <span>
                <label>Preco:</label>
                <input type="text" name="preco" id="preco" required>
            </span>
                <button style="width: 300px; margin-top: 10px;" type="submit">Salvar</button>
                <br/>
                <a href="home">Retornar</a>
            </div>
        </div>

        <c:if test="${not empty produtos}">
            <hr/>
            <div style="width: 100%; align-items: center; display: flex; flex-direction: column;">
                <table>
                    <thead>
                    <tr>
                        <th>Id</th>
                        <th>Produto</th>
                        <th>Preco</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="u" items="${produtos}">
                        <tr>
                            <td>${u.id}</td>
                            <td>${u.nome}</td>
                            <td>${u.preco}</td>
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
