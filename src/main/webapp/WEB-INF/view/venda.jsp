<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<body>
<div>
    <form action="/venda" method="post">
        <div style="width: 100%; align-items: center; display: flex; flex-direction: column;">
            <h1>Item da venda</h1>
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
                        <th>x</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="u" items="${produtos}">
                        <tr>
                            <td>${u.id}</td>
                            <td>${u.nome}</td>
                            <td>${u.preco}</td>
                            <td><a href="/venda/${u.id}/comprar">Comprar</a></td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </c:if>

        <a href="home">Retornar</a>
    </form>



</div>
</body>
</html>
