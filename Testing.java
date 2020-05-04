import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Testing
{
	public static void main(String args[])
	{
		List<String> names=new ArrayList<String>();
		names.add("ram");
		names.add("mohan");
		names.add("sohan");
		names.add("ramu");
		System.out.println(names);
		
		//now we want to sort it
		//first sort using java 7
		
		Testing obj1=new Testing();
		System.out.println("sort by java 7\n");
		obj1.sortby7(names);
		System.out.println(names);
		
		System.out.println("sort by java 8");
		obj1.sortby8(names);
		System.out.println(names);
	}
	private void sortby7(List<String> name) 
	{
		// TODO Auto-generated method stub
		Collections.sort(name,new Comparator<String>()
		{
			public int compare(String s1,String s2)
			{
				return s1.compareTo(s2);
			}
		});	
	}
	//now with java 8
	private void sortby8(List<String> name)
	{
		Collections.sort(name,(s1,s2)->s1.compareTo(s2));
	}
}	