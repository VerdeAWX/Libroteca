package modelo;
public class Estudiante { private int id; private String nombre,rut,curso,correo;
 public Estudiante(int id,String nombre,String rut,String curso,String correo){this.id=id;this.nombre=nombre;this.rut=rut;this.curso=curso;this.correo=correo;}
 public int getId(){return id;} public String getNombre(){return nombre;} public String getRut(){return rut;} public String getCurso(){return curso;} public String getCorreo(){return correo;}
 public String toString(){return id+" - "+nombre+" ("+curso+")";}
}