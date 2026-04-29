package refactoringEjercicio3IteradoresCircularesBis;

public abstract class Ring {
	protected int idx;
	
	public Ring() {
		idx = 0;
	}
	
	protected int nextIndex(int length) {
		if (idx >= length)
			idx = 0;
		return idx++;
	}
	
}
