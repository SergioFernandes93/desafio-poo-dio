package dominio;

public class Mentoria extends Conteudo{
	
	private int data;

	
	public Mentoria() {
		
	}
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	
	public double calcularXp() {
		return XP_PADRAO + 20;
	}
	
	public String toString() {
		return "Mentoria{ " + 
				"tiutlo=" + getTitulo() + "\"" +
				", descricao=" + "\"" + 
				",data" + getData() +
				"}";
	}

}
