package es.open4job.web.DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Logger;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 * Clase para evitar codigo duplicado en los DAO. 
 * Crea la conexión a la BD.
 * 
 * @author ccano
 *
 */
public class GenericDAO {
	public static final Logger logger = Logger.getLogger(GenericDAO.class
			.getName());

	protected Connection connection = null;

	public void abrirConexion() throws SQLException, ClassNotFoundException,
			NamingException {

		// necesario el context.xml en webapp/META-INF
		Context initContext = new InitialContext();
		Context envContext = (Context) initContext.lookup("java:/comp/env");
		DataSource ds = (DataSource) envContext.lookup("jdbc/myoracle");
		connection = ds.getConnection();
	}

	public void cerrarConexion() {

		if (connection != null) {

			try {
				connection.close();
			} catch (SQLException e) {
			}

		}

	}
}
