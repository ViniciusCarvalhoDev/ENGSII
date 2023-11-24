package Utils;

import java.util.ArrayList;
import java.util.List;

public class MySet<T> {
	private List<T> elementos = new ArrayList<>();
	
	public MySet() {
        this.elementos = new ArrayList<>();
    }
	
	public void add(T element){
		this.elementos.add(element);	
	}
	
	public void addAll(List<T> elements){
		this.elementos.addAll(elements);	
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
        
        List<T> resultado = this.elementos;
        resultado.addAll(uniqueInB);
        
        return resultado;
    }
	
	public List<T> intersConj(List<T> A) {
        List<T> intersection = new ArrayList<>();

        for (T element : A) {
            if (this.elementos.contains(element)) {
                intersection.add(element);
            }
        }

        return intersection;
    }
	
	public  List<T> diffConj(List<T> A) {
		List<T> intersection = this.intersConj(A);
        List<T> result = this.elementos;
        
        for (T element : intersection) {
        	result.remove(result.indexOf(element));
        }

        return result;
    }

}

