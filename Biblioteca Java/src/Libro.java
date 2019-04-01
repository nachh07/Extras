public class Libro {
    private String titulo, autor;
    private int cant_paginas;
    private int ISBN;
    private int año_edicion;
    private String editorial;
    private String genero;
    public Libro(){
    
    }
    public Libro(String titulo, String autor, int cant_paginas,int ISBN, int año_edicion, String editorial, String genero){
        this.titulo = titulo;
        this.autor = autor;
        this.cant_paginas = cant_paginas;
        this.ISBN = ISBN;
        this.año_edicion = año_edicion;
        this.editorial = editorial;
        this.genero = genero;
        }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCant_paginas() {
        return cant_paginas;
    }

    public void setCant_paginas(int cant_paginas) {
        this.cant_paginas = cant_paginas;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getAño_edicion() {
        return año_edicion;
    }

    public void setAño_edicion(int año_edicion) {
        this.año_edicion = año_edicion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public String verDatos(){
        return "Titulo" + getTitulo() +
        "Autor" + getAutor() +
        "Editorial" + getEditorial() +
        "Cantidad de páginas" + getCant_paginas() + 
        "ISBN" + getISBN() + 
       "Año de edición" + getAño_edicion();
        
    }
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ISBN;
		result = prime * result + ((autor == null) ? 0 : autor.hashCode());
		result = prime * result + año_edicion;
		result = prime * result + cant_paginas;
		result = prime * result + ((editorial == null) ? 0 : editorial.hashCode());
		result = prime * result + ((genero == null) ? 0 : genero.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		return result;
	}
	/*@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		if (ISBN != other.ISBN)
			return false;
		if (autor == null) {
			if (other.autor != null)
				return false;
		} else if (!autor.equals(other.autor))
			return false;
		if (año_edicion != other.año_edicion)
			return false;
		if (cant_paginas != other.cant_paginas)
			return false;
		if (editorial == null) {
			if (other.editorial != null)
				return false;
		} else if (!editorial.equals(other.editorial))
			return false;
		if (genero == null) {
			if (other.genero != null)
				return false;
		} else if (!genero.equals(other.genero))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}*/
	
	public boolean equals(Object o){
		if (this == o)
			return true;
		if (! (o instanceof Libro) )
		 return false;
		Libro librito = (Libro) o;
		if(librito.titulo.equals(this.titulo) &&
			librito.autor.equals(this.autor) &&
			librito.año_edicion == this.año_edicion ){
			return true;
		}else{
			return false;
		}
	}
	
}
	
	
	
	

    
