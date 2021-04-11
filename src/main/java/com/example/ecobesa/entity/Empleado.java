package com.example.ecobesa.entity;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="empleados")
public class Empleado implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombres;
	private String apellidos;
	private Integer dni;
	private Integer telefono;
	private String nacionalidad;
	private boolean sexo;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fecha_nacimiento;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fecha_ingreso;
	private String foto;
	private boolean estado;
	private String apctitudEmo;
	private String direccion;
	
	@OneToMany(mappedBy = "empleados")
	private List<Consulta> consulta;
	
	@OneToOne(mappedBy = "empleados", cascade = CascadeType.ALL)
	private Emo emo;
	
	@ManyToOne
	private Sede sede;
	
	@ManyToMany()
	@JoinTable(name="gestion_incidentes_empleado")
	private List<GestionIncidentes> gestionIncidentes;
	
	public Empleado() {
		
	}
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	

	public List<Consulta> getConsulta() {
		return consulta;
	}


	public void setConsulta(List<Consulta> consulta) {
		this.consulta = consulta;
	}


	public List<GestionIncidentes> getGestionIncidentes() {
		return gestionIncidentes;
	}


	public void setGestionIncidentes(List<GestionIncidentes> gestionIncidentes) {
		this.gestionIncidentes = gestionIncidentes;
	}




	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public Emo getEmo() {
		return emo;
	}


	public void setEmo(Emo emo) {
		this.emo = emo;
	}


	public String getApctitudEmo() {
		return apctitudEmo;
	}


	public void setApctitudEmo(String apctitudEmo) {
		this.apctitudEmo = apctitudEmo;
	}

	

	public Date getFecha_ingreso() {
		return fecha_ingreso;
	}


	public void setFecha_ingreso(Date fecha_ingreso) {
		this.fecha_ingreso = fecha_ingreso;
	}


	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public Integer getDni() {
		return dni;
	}
	public void setDni(Integer dni) {
		this.dni = dni;
	}
	public Integer getTelefono() {
		return telefono;
	}
	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public boolean isSexo() {
		return sexo;
	}
	public void setSexo(boolean sexo) {
		this.sexo = sexo;
	}
	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public Sede getSede() {
		return sede;
	}

	public void setSede(Sede sede) {
		this.sede = sede;
	}
	
	public int calcularEdad() throws ParseException {

		return  25;
	}
	
	public Integer calcularConsultas() {
		Integer x=consulta.size();
		return x;
	}
	
	public String calcularUltimaFecha() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		
		
		
		int size= consulta.size();
		if(consulta.size()!=0) {
			
		String fechaComoCadena = sdf.format(consulta.get(size-1).getFecha());
			
		return fechaComoCadena;
		}
		else {
			return "Sin consulta";
		}
	}
	public String fechaEmo() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		
		if(emo!=null) {
			String comentario =  sdf.format(emo.getFecha());
			
			return comentario;
		}else {
			return "sin registro";
		}
		
	}
	
	public String obtenerComentario(){
		
		int size= consulta.size();
		if(size!=0) {
			String comentario = consulta.get(size-1).getRecomendaciones();
			
			return comentario;
		}else {
			return "Sin Comentarios";
		}
		
	}
	public String obtenerAptitud() {
		
		if(emo!=null) {
			String comentario = emo.getAptitud();
			
			return comentario;
		}else {
			return "No consultada";
		}
	}
	
	public String obtenerRestricciones() {
		if(emo!=null) {
			String comentario = emo.getRestriccion();
			
			return comentario;
		}else {
			return "Sin restricciones";
		}
	}
	
	public Integer descansoMedico() {
		int size= consulta.size();
		if(size!=0) {
			Integer comentario = consulta.get(size-1).getDescansoMedico();
			
			return comentario;
		}else {
			return 0;
		}
	}
	
	public String proximoEmo() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
      if(emo!=null) {
    	  Calendar calendar = Calendar.getInstance();
          calendar.setTime(emo.getFecha());
          
          calendar.add(Calendar.MONTH, emo.getIntervalo());
    	  
    	  
    	  return formatter.format(calendar.getTime())+"";
      }else {
    	  return "sin registro";
      }
		
	}
	
}
