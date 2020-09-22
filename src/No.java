
public class No {
	private Aluno item;
	private No proximo;
	
	
	public Aluno getItem() {
		return item;
	}

	public void setItem(Aluno item) {
		this.item = item;
	}

	public No getProximo() {
		return proximo;
	}

	public void setProximo(No proximo) {
		this.proximo = proximo;
	}

	
	 
	 public No(Aluno item) {
		this.item = item;
		proximo = null;
	}
	
	
}
