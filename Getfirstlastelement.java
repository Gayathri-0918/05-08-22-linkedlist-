package linkedlist;

import java.util.LinkedList;

public class Getfirstlastelement {

	public static void main(String[] args) 
	{
		LinkedList<String> l_list = new LinkedList<String>();
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        
        System.out.println("original list="+l_list);
       String first_element=l_list.getFirst();
       System.out.println("the first element is:"+first_element);
       String last_element=l_list.getLast();
       System.out.println("the last element is:"+last_element);
        


	}

}
