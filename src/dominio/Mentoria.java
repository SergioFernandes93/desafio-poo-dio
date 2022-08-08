package dominio;

public class Mentoria {
	private String titulo;
	private String descricao;
	private int data;
	
	
	public Mentoria(String titulo, String descricao, int data) {
		
		this.titulo = titulo;
		this.descricao = descricao;
		this.data = data;
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	
	public int calcularXP() {
		return ;
	}
	
}
