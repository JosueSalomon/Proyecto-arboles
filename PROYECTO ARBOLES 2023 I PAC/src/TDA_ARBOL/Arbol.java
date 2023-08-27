package TDA_ARBOL;

public class Arbol implements OperacionesARBOL{
	private Cursor arbol = new Cursor();

	/**
	 * 	Retorna el padre del nodo n en el arbol
	 */
	@Override
	public int PADRE(int n) {
		return arbol.obtenerPadre(n);
	}

	/**
	 * Retorna el hijo mas a la izquierda del nodo n en el arbol 
	 */
	@Override
	public int HIJO_MAS_IZQ(int n) {
		return arbol.getArbolIzqArreglo(n);
	}

	/**
	 * Retorna el hermano a la derecha del nodo n en el arbol 
	 */
	@Override
	public int HERMANO_DER(int n) {
		return arbol.getArbolDerArreglo(n);
	}

	/**
	 * Retorna la etiqueta del nodo n en el arbol 
	 */
	@Override
	public Object ETIQUETA(int n) {
		return 	arbol.getArbolDatoArreglo(n);		
	}

	/**
	 * Retorna el nodo raiz del arbol 
	 */
	@Override
	public int RAIZ() {
		return arbol.getRaiz();
	}

	/**
	 * Convierte A en un arbol nulo
	 */
	@Override
	public void ANULA() {
		arbol.setRaiz(-1);
		arbol.limpiarMemoria();
	}

	/**
	 * Crea raiz en el arbol
	 */
	@Override
	public int CREA(Object v) {
		int espLibre;
        espLibre = arbol.asignaMemoria();
        arbol.setArreglo_arbol_dato(v, espLibre);
        arbol.setRaiz(espLibre);
        return espLibre;
	}

	/**
	 * Metodo con parametros no definidos
	 * Para cada valor n crea un nodo con etiqueta v y le asigna n hijos que son las raices del arbol
	 */
	@Override
	public int CREAR(Object v, int... An) {
		int temp;
		int espLibre;
        espLibre = arbol.asignaMemoria();
        temp = espLibre;
        arbol.setArbolIzqArreglo(An[0], temp);
        arbol.setArbolDatoArreglo(v, temp);
        arbol.setArbolDerArreglo(-1, temp);
        for (int i = 0; i < An.length - 1; i++) {
            arbol.setArbolDerArreglo(An[i + 1], An[i]);
        }
        arbol.setRaiz(temp);
        return temp;
	}

	/**
	 * ORDEN PREVIO
	 * Ordena de forma <raiz, ordPrevio(A1), ...., ordPrevio(An)>
	 */
	@Override
	public void ORD_PREV(int n) {
		int c;

        System.out.print(arbol.getArbolDatoArreglo(n) + " , ");
        c = arbol.getArbolIzqArreglo(n);
        while (c != -1) {
            ORD_PRE(c);
            c = arbol.getArbolDerArreglo(c);
        }
		
	}

	/**
	 * ORDEN POSTERIOR
	 * Ordena de forma <ordPost(A1), ...., ordPost(An), raiz>
	 */
	@Override
	public void ORD_POS(int n){
		int c;
        c = arbol.getArbolIzqArreglo(n);
        while (c != -1) {
            ORD_POS(c);
            c = arbol.getArbolDerArreglo(c);
        }
        System.out.print(arbol.getArbolDatoArreglo(n) + " , ");
	}

	/**
	 * ORDEN SIMETRICO
	 * Ordena de forma <ordSim(A1), raiz, ordSim(A2), ...., ordSim(An)>
	 */
	@Override
	public void ORD_SIM(int n) {
		int c;

        if (arbol.getArbolIzqArreglo(n) == -1) {
            System.out.print(arbol.getArbolDatoArreglo(n) + " , ");
        } else {
            ORD_SIM(arbol.getArbolIzqArreglo(n));
            System.out.print(arbol.getArbolDatoArreglo(n) + " , ");
            c = arbol.getArbolDerArreglo(arbol.getArbolIzqArreglo(n));
            while (c != -1) {
                ORD_SIM(c);
                c = arbol.getArbolDerArreglo(c);
            }
        }
	}

	/**
	 * Muestra la cantidad de niveles que contiene el arbol
	 */
	@Override
	public void CantNiveles(){
		int nivel=0;
        int cont;
        for (int i=0; i<arbol.getRaiz();i++){
            if (arbol.getArbolIzqArreglo(i)==-1){
              cont = 1;
              int hijo=i;
              while (arbol.obtenerPadre(hijo)!=-1){
                  cont+=1;
                  hijo=arbol.obtenerPadre(hijo);
              }
               if (cont>nivel)
                   nivel=cont;
            }    
		}
		System.out.printf("\nEl arbol tiene : " + nivel +" niveles");
	}

	@Override
	public void mostrarArbol(){
		arbol.mostrarArbol();
	}
}




