package TDA_ARBOL;

public interface OperacionesARBOL {
	 public int PADRE(int n);
	    public int HIJO_MAS_IZQ(int n);
	    public int HERMANO_DER(int n);
	    public Object ETIQUETA(int n);
	    public int RAIZ();
	    public void ANULA();
	   /* public int CREA0(Object v);
	    public int CREA1(Object v,int A1);
	    public int CREA2(Object v,int A1,  int A2);
	    public int CREA3(Object v,int A1,  int A2, int A3);
	    public int CREA4(Object v,int A1,  int A2, int A3, int A4);
	    public int CREA5(Object v,int A1,  int A2, int A3, int A4, int A5);
	    public int CREA6(Object v,int A1,  int A2, int A3, int A4, int A5, int A6);
	    public int CREA7(Object v,int A1,  int A2, int A3, int A4, int A5, int A6, int A7);*/
	    public int CREA(Object v);
	    public int CREAR(Object v, int ...An);
		public void CantNiveles();
		public void mostrarArbol();
		
	    
	    public void ORD_PREV(int n);
	    public void ORD_POST(int n);
	    public void ORD_SIM(int n);
}
