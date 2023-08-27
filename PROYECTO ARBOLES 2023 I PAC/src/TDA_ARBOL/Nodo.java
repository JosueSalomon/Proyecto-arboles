package TDA_ARBOL;

public class Nodo {

	 	private int HIJO_MAS_IZQ;
	    private Object DATO;
	    private int HERMANO_DER;
       
		/**
		 * Retorna hijo mas izquierdo
		 */
		public int getHIJO_MAS_IZQ() {
			return HIJO_MAS_IZQ;
		}



		/**
		 * Modifica hijo más izquierdo 
		 */
		public void setHIJO_MAS_IZQ(int HIJO_MAS_IZQ) {
			this.HIJO_MAS_IZQ = HIJO_MAS_IZQ;
		}



		/**
		 * Retorna dato
		 */
		public Object getDATO() {
			return DATO;
		}



		/**
		 * Modifica dato 
		 */
		public void setDATO(Object DATO) {
			this.DATO = DATO;
		}



		/**
		 * Retorna hermano derecha
		 */
		public int getHERMANO_DER() {
			return HERMANO_DER;
		}



		/**
		 * Modifica hermano derecha
		 */
		public void setHERMANO_DER(int HERMANO_DER) {
			this.HERMANO_DER = HERMANO_DER;
		}
		
		 @Override
		    public String toString()
		    {
		        return "            "+HIJO_MAS_IZQ+ "            "+DATO+"        "+HERMANO_DER;
		    }
	}


