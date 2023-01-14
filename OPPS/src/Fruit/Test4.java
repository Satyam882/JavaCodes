package Fruit;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
public class Test4 {

	public static void main(String[] args) {
			ArrayList<Mango>mangoes=new ArrayList<>();
			Genutils.addMango(mangoes,new Mango());
			LinkedList<Alphanso>alphansoes=new LinkedList<>();
			Collection<?>coll=new HashSet<>();
			
	
	ArrayList<Float> l2=new ArrayList<>(List.of(1f,2.3f,3f,4.78f));
	System.out.println("max val" + max(l2) );

	}

	public static <T extends Number & Comparable<T>> T max(List<T>list)
	{
		T max=list.get(0);
		for(int i=1;i<list.size();i++)
			if(max.compareTo(list.get(i))< 0)
				max=list.get(i);
		T Max=(T)max;
			return Max;
	}
}




