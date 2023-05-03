<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
<head>
    <title>Cars</title>
</head>
<body>
<h2>All Cars</h2>
<br>

<table>
    <tr>
        <th>Model</th>
        <th>Color</th>
        <th>Price</th>
    </tr>

    <c:forEach var="car" items="${AllCars}">
        <tr>
            <td>${car.model}</td>
            <td>${car.color}</td>
            <td>${car.price}</td>
        </tr>
    </c:forEach>


</table>


</body>
</html>
