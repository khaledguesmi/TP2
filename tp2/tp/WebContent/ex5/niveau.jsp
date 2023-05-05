<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>niveau</title>
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">

</head>
<body>
<div class="col-md-4 mx-auto mt-5">
	<div class=" form mb-3">
		<h1>Votre niveau en programmation</h1>
		<hr>
		<%
			int score1 = Integer.parseInt(request.getParameter("choix1"));
			int score2 = Integer.parseInt(request.getParameter("choix2"));
			int totalScore = score1 + score2;
			if (totalScore < 3) {
				out.println("<p>Vous êtes un débutant.</p>");
			} else if (totalScore < 5) {
				out.println("<p>Vous avez un niveau moyen.</p>");
			} else {
				out.println("<p>Vous êtes un expert !</p>");
			}
		%>
		<button class="btn btn-info form-control mb-3" onclick="window.history.back()"> Retour</button>
	</div>
</div>
</body>
</html>