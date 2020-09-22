
public class Main {

	public static void main(String[] args) {
		
		Lista lista = new Lista();
		
		lista.addPrimeiro(1, "Lilian", "Terceiro", "A");
		lista.addPrimeiro(2, "Juliana", "Terceiro", "A");
		lista.addFinal(3, "Vagner", "Terceiro", "A");
		lista.addFinal(4, "Carol", "Terceiro", "A");
		lista.addPosicao(4, 0, "Gusta", "Quarto", "B");
		lista.apresentar();
		lista.removerPrimeiro();
		lista.removerFinal();
		lista.removerPosicao(1);
		lista.apresentar();
		
		

	}

}
