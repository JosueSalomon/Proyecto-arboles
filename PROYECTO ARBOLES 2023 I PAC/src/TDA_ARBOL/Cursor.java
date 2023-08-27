package TDA_ARBOL;
import java.util.ArrayList;
public class Cursor {
	 
    private int raiz;
    private boolean[] memoria = new boolean[15];
    private Nodo[] arregloArbol = new Nodo[15];

   
    public Cursor() {
        // Inicializar la memoria
        for (int i = 0; i < memoria.length; i++) {
            memoria[i] = true;
        }
        
        // Inicializar el arreglo del árbol
        for (int i = 0; i < arregloArbol.length; i++) {
            Nodo nuevoNodo = new Nodo();
            nuevoNodo.setHIJO_MAS_IZQ(-1);
            nuevoNodo.setHERMANO_DER(-1);
            arregloArbol[i] = nuevoNodo;
        }
    
        // Establecer la raíz como -1
        raiz = -1;
    }
    
    public int asignaMemoria() {
        for (int i = 0; i < memoria.length; i++) {
            if (memoria[i] == true) {
                memoria[i] = false;
                return i;
            }

        }

        return -1;
    }

	public int obtenerPadre(int n) {
	    for (int i = 0; i < arregloArbol.length; i++) {
	        int hijo = arregloArbol[i].getHIJO_MAS_IZQ();
	        while (hijo != -1) {
	            if (hijo == n) {
	                return i;
	            }
	            hijo = arregloArbol[hijo].getHERMANO_DER();
	        }
	    }
	    return -1;
	}
	public void mostrarArbol() {
		System.out.println("Cubeta   hijo-mas-izquierdo       Etiqueta     Hermano-Derecho");
		for (int i = 0; i < arregloArbol.length; i++) {
			Nodo nodo = arregloArbol[i];
			String infoNodo = String.format("%d ---> %s", i, nodo.toString());
			System.out.println(infoNodo);
		}
	}
	
	public void limpiarMemoria() {
		for (int i = 0; i < memoria.length; i++) {
			memoria[i] = true;
		}
	}

    public boolean getMemoria(int i) {
        return memoria[i];
    }
    
    
	public void setMemoria(boolean[] memoria) {
		this.memoria = memoria;
	}
	
	public int getArbolIzqArreglo(int i) {
		return arregloArbol[i].getHIJO_MAS_IZQ();
	}

	public int getArbolDerArreglo(int i) {
		return arregloArbol[i].getHERMANO_DER();
	}

	public Object getArbolDatoArreglo(int i) {
		return arregloArbol[i].getDATO();
	}
	
	public void setArbolIzqArreglo(int izq, int i) {
		this.arregloArbol[i].setHIJO_MAS_IZQ(izq);
	}

	public void setArbolDerArreglo(int der, int i) {
		this.arregloArbol[i].setHERMANO_DER(der);
	}

	public void setArbolDatoArreglo(Object dat, int i) {
		this.arregloArbol[i].setDATO(dat);
	}
	    
	
	public int getRaiz() {
		return raiz;
	}

	
	public void setRaiz(int raiz) {
		this.raiz = raiz;
	}

	
	public Nodo[] getArbolArreglo() {
		return arregloArbol;
	}

	
	public void setArbolArreglo(Nodo[] arregloArbol) {
		this.arregloArbol = arregloArbol;
	}
	
	
}
