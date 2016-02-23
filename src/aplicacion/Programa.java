package aplicacion;

import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.commons.dbcp2.BasicDataSource;

import dao.ColegaDao;
import modelo.Colega;
import negocio.NegocioColega;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicDataSource ds = new BasicDataSource();
		ds.setUrl("jdbc:mysql://localhost:3306/colegajdbc"); // cadena de conexion
		ds.setUsername("root");
		ds.setPassword("root");
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ColegaDao colegaDao = new ColegaDao(ds);
		NegocioColega negocioColega = new NegocioColega(colegaDao);
		try {
			//negocioColega.listarTodosLosColegas();
			Colega colega = negocioColega.unColega();
			
			negocioColega.insertarUnColega(colega);
			
			Colega colega2 = negocioColega.unColega();
			Colega colega3 = negocioColega.unColega();
			ArrayList<Colega> grupoColegas = new ArrayList<>();
			grupoColegas.add(colega2);
			grupoColegas.add(colega3);
			negocioColega.insertarVariosColegas(grupoColegas);

			negocioColega.listarTodosLosColegas();
			System.out.println("El numero de colegas es: " + negocioColega.numeroColegas());
			// probar buscar colega
			System.out.print("El usuario con id 3 es : ");
			negocioColega.buscarColega(3);
			negocioColega.borrarColega(2);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
