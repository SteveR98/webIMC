package clasesIMC;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletPeso
 */
@WebServlet("/ServletIMC")
public class ServletIMC extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletIMC() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
				try{
		PrintWriter pw = response.getWriter();
		String altura = request.getParameter("kg");
		String peso = request.getParameter("m");
		
		String mensaje = null;
		
		float imc = 0;
		float valor_altura = Float.valueOf(altura);
		float valor_peso = Float.valueOf(peso);
		imc=IMCService.calcula(valor_altura, valor_peso);

		
		mensaje = IMCService.traduceIMC(imc);
		
		pw.write("SU IMC: " +mensaje);
				}
				catch (Throwable e)
				{
					throw e;
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
