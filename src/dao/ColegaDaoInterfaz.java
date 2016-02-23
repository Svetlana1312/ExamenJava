package dao;

import java.sql.SQLException;
import java.util.ArrayList;

import modelo.Colega;

public interface ColegaDaoInterfaz {
	public int maxId() throws SQLException;
	public void alta(Colega colega) throws SQLException;
	public void baja(int id) throws SQLException;
	public Colega consulta(int id) throws SQLException;
	public ArrayList<Colega> consulta() throws SQLException;
	public int contar() throws SQLException;
}
