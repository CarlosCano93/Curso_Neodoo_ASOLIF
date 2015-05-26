
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Listado de biceberg</h1>

	<!-- Muestra por pantalla el detalle de todos los objetos 
	del List (que paso en el atributte desde el Action) -->

	<logic:iterate name="biceberg" id="listBiceberg">
		<p>
			<bean:write name="listBiceberg" />
		</p>
	</logic:iterate>
</body>
</html>