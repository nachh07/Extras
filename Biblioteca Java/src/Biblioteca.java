import java.util.ArrayList;	
public class Biblioteca {
    private int stock;
    private int cantidadLibros;
    ArrayList <Libro> libro = new ArrayList<Libro>();
    String [] generos = {"aventura","suspenso","terror"};
    public Biblioteca(int stock, int cantidadLibros){
        this.stock = stock;
        this.cantidadLibros = cantidadLibros;        
    }
    
    public void listarLibros() {
    	libro.add(new Libro("Tit","aut",0,0,0,"edit","gen"));
    	libro.add(new Libro("Tit","autor",0,0,0,"edit","gen"));
    	libro.add(new Libro("Tit","aut",0,0,0,"edit","gen"));
    	libro.add(new Libro("Tit","aut",0,0,0,"edit","gen"));
    	libro.add(new Libro("Tit","aut",0,0,0,"edit","gen"));
    	libro.add(new Libro("Tit","aut",0,0,0,"edit","gen"));
    	int i;
    	int size = libro.size();
    	for(i=0;i<libro.size();i++) {
    		System.out.println(libro.get(i));
    		
    	}
    	
    }
    
    public void añadirLibros(Libro a){
        int i;
        for(i=0;i<libro.size();i++){
        libro.add(a);
        System.out.println(i);
        }
    }	
    public boolean consultarLibro(Libro a){
        libro.add(a);
        int i;
        for(i=0;i<libro.size();i++){
        	if(libro.contains(a)== libro.add(a)){
        		return true;
        	}else{
        		return false;
        			}
    			}
        		return false;
    	}
    
    public void eliminarLibro(){
    	int i;
    	for(i=0;i<libro.size();i++){
    		if(libro.contains(i)){
    			libro.remove(i);
    		}
    	}
    }
    
    public void consultarPorTitulo(String tit){
    	int i = 0;
    	for(i=0;i<libro.size();i++){//inicio de recorrer la lista
    		if(libro.get(i).equals(tit)) {
    			System.out.println(libro.get(i).verDatos());
    		}//el get de i me trae un libro y puedo acceder a todos sus metodos
    	}//termina de recorrer la lista con el for
    }

    public void darDeAlta(Libro a){//verifica si no existe libro
    	int i;
    	for(i = 0;i<libro.size();i++){
    		if(!libro.contains(a)){//si no contiene a 
    			System.out.println("No existe el libro");
    		}else{//si contiene a 
        		System.out.println("El libro existe en la lista");
        		}
    	}
    }
    
    public void darDeBaja(Libro a){
    	int i;
    	for(i=0;i<libro.size();i++){
    		if(libro.contains(a)){
    			System.out.println("El libro existe");
    		}else{
    			System.out.println("El libro no existe");
    		}
    	}
    }
    
    public void listarAutores(String apellido){
    	int i;
    	for(i=0;i<libro.size();i++){
    		if(libro.get(i).getAutor().contains(apellido)) {
    			System.out.println(libro.get(i).getTitulo());
    		}
    	}
     
    	
    }    
   
   public void listarGeneros(){
	   int i;
	   for(i=0;i<generos.length;i++){
		   	System.out.println(generos[i]);
	   }
	   
   }

   public void listarEditorial(Libro a){
	   int i;
	   for(i=0;i<libro.size();i++){
		   if(libro.get(i).getEditorial().contains("editorial"));
		    System.out.println(libro.get(i).getEditorial());
	   }
   }
   
   public void listarLibrosporAño(String edit, int desde, int hasta){
	   int i;
	   for(i=0;i<libro.size();i++){
		   String e = libro.get(i).getEditorial();
		   int aa = libro.get(i).getAño_edicion();
		   if(e.equals(edit) && aa <= hasta && aa >= desde )//se fija si dos strings son iguales y los compara 
			   System.out.println(libro.get(i).getTitulo());
	   }
   }//get i es para obtener el libro, es decir, la posición 
   
   public void listarxDeterminadoAño(int año){
	   ArrayList<Libro> arr1 = new ArrayList<Libro>();
	   int i;
	   for(i=0;i<libro.size();i++){
		int an = libro.get(i).getAño_edicion();
		if(an == año){
			arr1.add(libro.get(i));//agregando el libro filtrado por año al nuevo array
		}
   }int b;
	for(b=0;b<arr1.size();b++){
		System.out.println(arr1.get(i).getTitulo());
	} 
   }
}
    
    
    

