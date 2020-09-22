
public class Lista {
	
	No primeiro = null , calda = null;

	public void addPrimeiro(int ra, String nome, String semestre, String turma) {
		No novo = new No(new Aluno(ra, nome, turma, semestre));
		
		if (primeiro == null) {
			primeiro = novo;
			calda = novo;
			novo.getItem().apresentar();
		}else {
			novo.setProximo(primeiro);
			primeiro = novo;
			novo.getItem().apresentar();
		}
	}
	
	public void removerPrimeiro() {
		if (primeiro == null) {
			System.out.println("Não há elementos para remover");
		}else {
			No auxiliar = primeiro;
			primeiro = auxiliar.getProximo();
			auxiliar.setProximo(null);
			
			
		}
		
		
	}
	
	public void addFinal(int ra, String nome, String semestre, String turma) {
		No novo = new No(new Aluno(ra, nome, turma, semestre));
		
		if (primeiro == null) {
			primeiro = novo;
			calda = novo;
		}else {
			calda.setProximo(novo);
			calda = novo;
		}
	}
	
	public void removerFinal() {
		if (primeiro == null) {
			System.out.println("Não há elementos para remover");
		}else {
			No auxiliar = primeiro;
			while (auxiliar != null) {
				if (auxiliar.getProximo().getProximo() == null) {
					No auxiliar2 = calda;
					calda = auxiliar;
					calda.setProximo(null);
				}
				
				auxiliar = auxiliar.getProximo();
				
			}
		}
	}
	
	
	public void removerPosicao(int pos) {
		No auxiliar = primeiro;
		No anterior = null;
		for (int i = 0; auxiliar != null; i++) {
			if (i == pos) {
				if (anterior == null) {
					primeiro = auxiliar.getProximo();
					break;
				}
				
				anterior.setProximo(auxiliar.getProximo());
			}
			
			anterior = auxiliar;
			auxiliar = auxiliar.getProximo();
			
		}
		
	}
	
	public void addPosicao(int pos, int ra , String nome, String turma, String semestre) {
		No auxiliar = primeiro;
		No anterior = null;
		
		for (int i = 0;  auxiliar != null; i++) {
			if (i == pos) {
				
				
				if (i == 0) {
					No novo = new No(new Aluno (ra , nome, turma, semestre));
					novo.setProximo(primeiro);
					primeiro = novo;
					break;
				}
				
				
				
				No novo = new No(new Aluno (ra , nome, turma, semestre));
				novo.setProximo(auxiliar);
				anterior.setProximo(novo);
				
			}
			
			if (auxiliar.getProximo() == null) {
				if (i+1 == pos) {
					No novo = new No(new Aluno (ra , nome, turma, semestre));
					auxiliar.setProximo(novo);
					break;
					
				}
			}
			
			anterior = auxiliar;
			auxiliar = auxiliar.getProximo();
		}
	}
	
	
	
	
	public void apresentar() {
		No aux = primeiro;
		
		System.out.println("lista");
		while (aux != null) {
			
			System.out.println("Nome: "+ aux.getItem().getNome() + " RA: "+ aux.getItem().getRA() + " Semestre: "+ aux.getItem().getSemestre() + " Turma: "+aux.getItem().getTurma());
			aux = aux.getProximo();
		}
	}
	
}
