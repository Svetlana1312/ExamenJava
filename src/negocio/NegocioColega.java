package negocio;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import dao.ColegaDaoInterfaz;
import modelo.Colega;

public class NegocioColega implements NegocioColegaInterfaz {
	
	private ColegaDaoInterfaz dao;
	
	public NegocioColega(ColegaDaoInterfaz dao) {
		super();
		this.dao = dao;
	}
	public Colega unColega(){
		
		SecureRandom ran = new SecureRandom();
	  
		String nombre =new BigInteger(130, ran).toString(32);
		String ciudad =new BigInteger(130, ran).toString(32);
		
		//Date fecha = new Date(Math.abs(System.currentTimeMillis() - ran.nextLong()));
		Date fecha = new Date();
		Colega nuevo = new Colega(nombre,ciudad,fecha);
		return nuevo;
		
		
	}
	public void listarTodosLosColegas() throws SQLException{
		ArrayList<Colega> listaColegas = dao.consulta();
		for(Colega colega:listaColegas ){
			System.out.println(colega);
		}
	}
	public int idMayorColegas() throws SQLException{
		return dao.maxId();
	}
	public int numeroColegas() throws SQLException{
		return dao.contar();
	}
	public void insertarUnColega(Colega colega) throws SQLException{
		dao.alta(colega);
	}
	public void insertarVariosColegas(ArrayList<Colega> listaColegas) throws SQLException{
		for(Colega colega:listaColegas){
			dao.alta(colega);
		}
	}
	public void buscarColega(int id) throws SQLException{
		Colega colega = dao.consulta(id);
		System.out.println(colega);
	}
}
