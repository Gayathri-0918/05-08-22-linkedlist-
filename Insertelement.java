package linkedlist;

import java.util.LinkedList;

public class Insertelement {

	public static void main(String[] args)
	{
		LinkedList<String> l_list = new LinkedList<String>();
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("White");
        l_list.add("Pink");
        System.out.println("original list:"+l_list);
        l_list.add(1,"yellow");
        System.out.println("moderate list:"+l_list);
        

	}

}
