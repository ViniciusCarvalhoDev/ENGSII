package Program;

import java.util.ArrayList;
import java.util.List;

import Utils.MySet;

public class main {

	public static void main(String[] args) {
		
		MySet mySet = new MySet();
        
        List<Object> listA = new ArrayList<>();
        listA.add(1);
        listA.add(2);
        listA.add(3);
        listA.add(25);
        
        mySet.addAll(listA);
        mySet.uniaoConj(listA);


        List<Object> listB = new ArrayList<>();
        listB.add(3);
        listB.add(4);
        listB.add(5);

        List<Object> result = mySet.uniaoConj(listB);
        System.out.println("Union: " + result);
        
        System.out.println("Union: " + mySet.intersConj(listB));
	}

}
