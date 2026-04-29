package refactoringEjercicio3IteradoresCircularesBis;

public class CharRing extends Ring{
    private char[] source;

    public CharRing(String src) {
        source = src.toCharArray();
        idx = 0;
    }

    public int next() {
    	return source[nextIndex(source.length)];
    }

   
}
