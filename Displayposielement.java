package linkedlist;

import java.util.LinkedList;

public class Displayposielement {

	public static void main(String[] args)
	{
		LinkedList<String> l_list = new LinkedList<String>();
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        
        System.out.println("original list="+l_list);
        for(int p=0;p<=l_list.size();p++)
        {
        	System.out.println("position and elements"+p+".."+l_list.get(p));
        }

	}

}
