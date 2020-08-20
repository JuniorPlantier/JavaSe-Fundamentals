
public class Produto {

	private int id;
	private String descricao;
	
	public Produto(int id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}

	public int getId() {
		return id;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", descricao=" + descricao + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		if (getClass() != obj.getClass()) // if(!(obj instanceof Produto))
			return false;
		
		Produto other = (Produto) obj;
		if (id != other.id)
			return false;
		
		return true;
	}
	
	/*
	 * Todas as coleções do Java que tem hash no nome, utilizando o algoritmo de hash para
	 * fazer a busca.
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	
	
}
