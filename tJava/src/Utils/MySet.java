package Utils;

import java.util.ArrayList;
import java.util.List;

public class MySet<T> {
	private List<T> elementos = new ArrayList<>();
	
	public MySet() {
        this.elementos = new ArrayList<>();
    }
	
	public List<T> getConjunto(){
		return this.elementos;
	}
	public void removeItems(Object item) {
        elementos.removeIf(i -> i.equals(item));
    }
	public Boolean eh_vazio(){
		return this.elementos.isEmpty();
	}
	
	public List<T> uniaoConj(List<T> A) {
        List<T> uniqueInB = new ArrayList<>();

        for (T element : A) {
            if (!this.elementos.contains(element)) {
                uniqueInB.add(element);
            }
        }

        this.elementos.addAll(uniqueInB);
        return this.elementos;
    }

}

