<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<html>
<body>
<h1>welcome!!!</h1>

<h1><c:out value="${result}"></c:out></h1>
<form:errors path="user1.*"/>
<form action="/spring-mvc-tuto/postinfo" method=post>
<table>
<p>userName<input type="test" name="username"/>
</p>
<p>userId<input type="test" name="id"/>
</p>

<p> list<select name="strings" multiple>
<option value="a">a</option>
<option value="b">b</option>
</select>
</p>

<table>
<tr>
<td>address</td></tr>
<tr>
<td>country<input type="test" name="address.country"/></td>
<td>state<input type="test" name="address.state"/></td>
<td>pin<input type="test" name="address.pin"/></td>
</tr>
</table>
<input type="submit" value="submit"/>
</table>
</form>
</h1>
</body>
</html>