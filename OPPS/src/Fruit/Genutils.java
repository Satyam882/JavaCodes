package Fruit;

import java.util.List;

public class Genutils {

	//public static void main(String[] args) {
		public static void addMango(List<? super Mango>list,Mango m)
		{
			list.add(m);
			//which all types of instances can u add to such a list ?
			//list.add(new Fruit1());
			list.add(new Alphanso());
			
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


