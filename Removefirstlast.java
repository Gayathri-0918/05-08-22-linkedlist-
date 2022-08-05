package linkedlist;

import java.util.LinkedList;

public class Removefirstlast {

	public static void main(String[] args) 
	{

		LinkedList<String> l_list = new LinkedList<String>();
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        
        System.out.println("original list="+l_list);
        l_list.removeFirst();
        l_list.removeLast();
        System.out.println("After insert element list:"+l_list);


       }
}
