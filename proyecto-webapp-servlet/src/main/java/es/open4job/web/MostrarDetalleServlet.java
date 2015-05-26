package es.open4job.web;

import java.io.IOException;

import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import es.open4job.web.DAO.AparcamientoMotoDAO;
import es.open4job.web.VO.AparcamientoMotoVO;

/**
 * Servlet implementation class MostrarDetalleServlet
 */
public class MostrarDetalleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String HOST = "54.154.192.80";
	private static final String PUERTO = "1521";
	private static final String SID = "xe";
	private static final String USER = "test";
	private static final String PASSWORD = "test";
	private static final String URL = "jdbc:oracle:thin:" + USER + "/"
			+ PASSWORD + "@" + HOST + ":" + PUERTO + ":" + SID;

	public MostrarDetalleServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		AparcamientoMotoDAO aparcamientoMotoDAO = new AparcamientoMotoDAO(
				DRIVER, URL, USER, PASSWORD);

		HttpSession sesion = request.getSession();

		// coge la variable de session
		int id = (Integer) sesion.getAttribute("id");

		AparcamientoMotoVO motoDetalle = null;

		try {

			motoDetalle = aparcamientoMotoDAO.getDetailAparcamientoMoto(id);

		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// envía el objeto
		request.setAttribute("motoDetalle", motoDetalle);
		request.getRequestDispatcher("DetalleMoto.jsp").forward(request,
				response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
