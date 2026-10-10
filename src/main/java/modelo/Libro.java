package modelo;
public class Libro { private int id,stock,idCategoria; private String titulo,autor,isbn,editorial,categoria;
 public Libro(int id,String titulo,String autor,String isbn,String editorial,int stock,int idCategoria,String categoria){this.id=id;this.titulo=titulo;this.autor=autor;this.isbn=isbn;this.editorial=editorial;this.stock=stock;this.idCategoria=idCategoria;this.categoria=categoria;}
 public int getId(){return id;} public String getTitulo(){return titulo;} public String getAutor(){return autor;} public String getIsbn(){return isbn;} public String getEditorial(){return editorial;} public int getStock(){return stock;} public int getIdCategoria(){return idCategoria;} public String getCategoria(){return categoria;}
 public String toString(){return id+" - "+titulo+" (stock: "+stock+")";}
}