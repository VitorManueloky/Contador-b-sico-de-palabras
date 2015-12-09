
public class Element {
	private String key;
	private int numero;
	
	public Element() {
		super();
	}
	public Element(String key, int numero) {
		
		super();
		this.key = key;
		this.numero = numero;
		this.toString();
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.key + "  :  " + this.numero;
	}
	
	
}
