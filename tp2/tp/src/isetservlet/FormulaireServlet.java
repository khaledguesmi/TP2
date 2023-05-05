package isetservlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormulaireServlet
 */
@WebServlet("/FormulaireServlet")
public class FormulaireServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormulaireServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Double op1 = 0.0;
		Double op2 = 0.0;
		String operation = "";
		try {
		    op1 = Double.parseDouble(request.getParameter("op1"));
		    op2 = Double.parseDouble(request.getParameter("op2"));
		    operation = request.getParameter("R");
		    if (op1 == null || op2 == null || operation == null || operation.equals("")) {
		        request.setAttribute("errorMessage", "Tous les champs sont obligatoires.");
		        RequestDispatcher disp = request.getRequestDispatcher("erreur.jsp");
		        disp.forward(request, response);
		    } else {
		        Double res = null;
		        if (operation.equals("/") && op2 == 0) {
		            request.setAttribute("errorMessage", "Impossible de diviser par 0.");
		            RequestDispatcher disp = request.getRequestDispatcher("erreur.jsp");
		            disp.forward(request, response);
		        } else {
		            switch(operation) {
		                case "+":
		                    res = op1 + op2;
		                    break;
		                case "-":
		                    res = op1 - op2;
		                    break;
		                case "*":
		                    res = op1 * op2;
		                    break;
		                case "/":
		                    res = op1 / op2;
		                    break;
		                default:
		                    request.setAttribute("errorMessage", "Opération non reconnue.");
		                    RequestDispatcher disp = request.getRequestDispatcher("erreur.jsp");
		                    disp.forward(request, response);
		                    return;
		            }
		            request.setAttribute("resultat", res);
		            request.setAttribute("op1", op1);
		            request.setAttribute("op2", op2);
		            request.setAttribute("operation", operation);
		            RequestDispatcher disp = request.getRequestDispatcher("reponse.jsp");
		            disp.forward(request, response);
		        }
		    }
		} catch (NumberFormatException e) {
		    request.setAttribute("errorMessage", "Tous les champs sont obligatoires.");
		    RequestDispatcher disp = request.getRequestDispatcher("erreur.jsp");
		    disp.forward(request, response);
		}

		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
	
	
	

	}
	
}
