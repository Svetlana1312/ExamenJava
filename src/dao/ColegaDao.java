package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import modelo.Colega;

public class ColegaDao implements ColegaDaoInterfaz{
	    private static final String INSERT_COLEGA="INSERT INTO colega(id,nombre,ciudad,fecha) VALUES(?,?,?,?)";
	    private static final String DELETE_COLEGA = "DELETE FROM colega WHERE id=?";
		private static final String UPDATE_COLEGA = "UPDATE colega SET nombre=?,ciudad=?,fecha=? "
				+ "WHERE isbn=?";
		private static final String SELECT_COLEGA_POR_ID = "SELECT * FROM colega WHERE id=?";
		private static final String SELECT_COLEGAS = "SELECT * FROM colega";
		private static final String MAX_ID = "SELECT MAX(id) as max_id FROM colega";	
		private static final String CONTAR_COLEGAS = "SELECT COUNT(*) as numero FROM colega";
	
   static int contador;
   private DataSource ds;
   
   //constructor
public ColegaDao(DataSource ds) {
	super();
	this.ds = ds;
	try { // rescatamos el ultimo id de la base de datos
		contador=this.maxId();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
   public int maxId() throws SQLException{
	   Connection connection = null;
       try {
			connection = ds.getConnection();
			 // 2- Obtener el statement
			 PreparedStatement ps = connection.prepareStatement(MAX_ID);
			
			 
			 //3 - Ejecutar la sentencia, dos formas - execute Query devuelve un ResultSet
			 // y execute Update
			 ResultSet result = ps.executeQuery();
			 
			// 4 - (Opcional, solo cuando sea una sentencia de tipo executeQuery) Procesado de los resultados.
			 if(result.first()){
				
				 return result.getInt("max_id");
				
			 }else 
				 return 0;
       }finally{
			 // 5. Cerrar la conexion
	         if(connection!=null)  connection.close();
			
		}
   }
   
	public void alta(Colega colega) throws SQLException{
		this.contador ++;
		 Connection connection = null;
         try {
			 connection = ds.getConnection();
			 // 2- Obtener el statement
			 PreparedStatement ps = connection.prepareStatement(INSERT_COLEGA);
			 ps.setInt(1,this.contador);
			 ps.setString(2, colega.getNombre());
			 ps.setString(3,colega.getCiudad());
			 
			 Date fecha = new Date(colega.getFecha().getTime());
			 ps.setDate(4, fecha);
			 
			 //3 - Ejecutar la sentencia, dos formas - execute Query devuelve un ResultSet
			 // y execute Update
			 ps.executeUpdate();
			 
			 // 4 - (Opcional, solo cuando sea una sentencia de tipo executeQuery) Procesado de los resultados.
			 
		}finally{
			 // 5. Cerrar la conexion
	         if(connection!=null)  connection.close();
			
		}
		
		
		
	}
	public void baja(int id) throws SQLException
	{
		Connection connection = null;
        try {
			connection = ds.getConnection();
			 // 2- Obtener el statement
			 PreparedStatement ps = connection.prepareStatement(DELETE_COLEGA);
			 ps.setInt(1,id);
			
			 
			 //3 - Ejecutar la sentencia, dos formas - execute Query devuelve un ResultSet
			 // y execute Update
			 ps.executeUpdate();
			 
			 // 4 - (Opcional, solo cuando sea una sentencia de tipo executeQuery) Procesado de los resultados.
			 
		}finally{
			 // 5. Cerrar la conexion
	         if(connection!=null)  connection.close();
			
		}
		
	}
	public Colega consulta(int id) throws SQLException{
		Connection connection = null;
        try {
			connection = ds.getConnection();
			 // 2- Obtener el statement
			 PreparedStatement ps = connection.prepareStatement(SELECT_COLEGA_POR_ID);
			 ps.setInt(1, id);
			 
			 //3 - Ejecutar la sentencia, dos formas - execute Query devuelve un ResultSet
			 // y execute Update
			 ResultSet result = ps.executeQuery();
			 
			// 4 - (Opcional, solo cuando sea una sentencia de tipo executeQuery) Procesado de los resultados.
			 if(result.first()){
				 java.util.Date fecha = new Date(result.getDate("fecha").getTime());
				 return new Colega(id,result.getString("nombre"),result.getString("ciudad"),fecha);
				
			 }else return null;
        }finally{
			 // 5. Cerrar la conexion
	         if(connection!=null)  connection.close();
			
		}
		
		
		
	}
	public ArrayList<Colega> consulta() throws SQLException{
		
		Connection connection = null;
		Colega colega = null;
		ArrayList<Colega> collection=new ArrayList<>();
		
        try {
			 connection = ds.getConnection();
			 // 2- Obtener el statement
			 PreparedStatement ps = connection.prepareStatement(SELECT_COLEGAS);
						 
			 //3 - Ejecutar la sentencia, dos formas - execute Query devuelve un ResultSet
			 // y execute Update
			 ResultSet result = ps.executeQuery();
			 
			// 4 - (Opcional, solo cuando sea una sentencia de tipo executeQuery) Procesado de los resultados.
			 
			 if(result.first()){
				 do{
					 java.util.Date fecha = new Date(result.getDate("fecha").getTime());
					collection.add(new Colega(result.getInt("id"),result.getString("nombre"),result.getString("ciudad"),
							 fecha));
				 }while(result.next());
			 }
			 return collection;
			 
			 
			 
			
		}finally{
			 // 5. Cerrar la conexion
	         if(connection!=null)  connection.close();
		
	}
		
	}
	public int contar() throws SQLException{
		 Connection connection = null;
	       try {
				connection = ds.getConnection();
				 // 2- Obtener el statement
				 PreparedStatement ps = connection.prepareStatement(CONTAR_COLEGAS);
				
				 
				 //3 - Ejecutar la sentencia, dos formas - execute Query devuelve un ResultSet
				 // y execute Update
				 ResultSet result = ps.executeQuery();
				 
				// 4 - (Opcional, solo cuando sea una sentencia de tipo executeQuery) Procesado de los resultados.
				 if(result.first()){
					
					 return result.getInt("numero");
					
				 }else 
					 return 0;
	       }finally{
				 // 5. Cerrar la conexion
		         if(connection!=null)  connection.close();
				
			}
	} 
}
