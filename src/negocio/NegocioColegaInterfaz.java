package negocio;

import java.sql.SQLException;
import java.util.ArrayList;

import modelo.Colega;

public interface NegocioColegaInterfaz {
	
	public Colega unColega();
	public void listarTodosLosColegas() throws SQLException ;
	public int idMayorColegas() throws SQLException;
	public int numeroColegas() throws SQLException;
	public void insertarUnColega(Colega colega) throws SQLException;
	public void insertarVariosColegas(ArrayList<Colega> listaColegas) throws SQLException;
	public void buscarColega(int id) throws SQLException;
	public void borrarColega(int id) throws SQLException;
}
