package modelo;

import java.util.Date;

public class Colega {
    private int id;
    private String ciudad;
    private String nombre;
    private Date fecha;
 // constructor con todos los campos
	public Colega(int id,  String nombre,String ciudad, Date fecha) {
		super();
		this.id = id;
		this.ciudad = ciudad;
		this.nombre = nombre;
		this.fecha = fecha;
	}
// constructor sin el id
	public Colega(String ciudad, String nombre, Date fecha) {
	super();
	this.ciudad = ciudad;
	this.nombre = nombre;
	this.fecha = fecha;
}

	//getter y setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
    
   public String toString(){
	   return "Id: " + this.id + " ,nombre: " + this.nombre + " ,ciudad " + this.ciudad; 
	   
   }
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + id;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (!(obj instanceof Colega))
		return false;
	Colega other = (Colega) obj;
	if (id != other.id)
		return false;
	return true;
} 
   
    
    
    
}
