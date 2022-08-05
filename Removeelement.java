package linkedlist;

import java.util.LinkedList;

public class Removeelement {

	public static void main(String[] args) 
	{
		LinkedList<String> l_list = new LinkedList<String>();
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        
        System.out.println("original list="+l_list);
        l_list.remove(1);
        System.out.println("after removing element"+l_list);

	}

}
