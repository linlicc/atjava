<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<body>
<div>
    <form>

        <div style="width: 100%; align-items: center; display: flex; flex-direction: column;">
            <h1>HOME</h1>

            <div style="display: flex; flex-direction: column;">

                <a href="produto">Cadastrar produto</a>
                <a href="venda">Comprar produto</a>

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

        </div>


        <a href="/">Sair</a>
    </form>



</div>
</body>
</html>
