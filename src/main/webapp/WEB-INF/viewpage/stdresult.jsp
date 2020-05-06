<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>

<html>
<body>
<h1>welcome!!!</h1>
<h1><c:out value="${result}"></c:out></h1>
 <table>
 <tr>
 <td>username</td>
 <td><c:out value="${user1.username}"></c:out></td>
 </tr>
 <td>id</td>
<td><c:out value="${user1.id}"></c:out></td>
 </tr>
 <tr>
  <td>list</td>

 <c:forEach items="${user1.strings}" var="item">
 <td>
 <c:out value="${item}"></c:out>
 </td>
 </c:forEach>
  </tr>

  <tr>
  <td>address</td></tr>
  <tr>
  <td>country</td>
  <td><c:out value="${user1.address.country}"></c:out></td>
  </tr>
  <tr>
  <td>state</td>
  <td><c:out value="${user1.address.state}"></c:out></td></tr>
  <tr>
  <td>pin</td>
  <td><c:out value="${user1.address.pin}"></c:out></td>
  </tr>
  </table>
  </body>
  </html>