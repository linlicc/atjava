<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<body>
<div>
    <form action="/login" method="post">

        <div style="width: 100%; align-items: center; display: flex; flex-direction: column;">
            <h1>Login</h1>

            <div style="display: flex; flex-direction: column;">
            <span>
                <label>usuario:</label>
                <input type="text" name="nome" id="nome" required>
            </span>
                <span>
                <label>Senha:</label>
                <input type="password" name="senha" id="senha" required>
            </span>
                <button style="width: 300px; margin-top: 10px;" type="submit">Salvar</button>
            </div>
        </div>

        <c:if test="${not empty senha_invalida}">

            ${senha_invalida}

        </c:if>



    </form>



</div>
</body>
</html>
