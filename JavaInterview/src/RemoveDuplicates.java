import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class RemoveDuplicates
{
	public static void main(String[] args)
	{
		
		List<Object> list = new ArrayList<Object>();
		list.add(3);
		list.add("Rama");
		list.add(98);
		list.add("Radha");
		list.add(2);
		list.add("Krishna");
		list.add(77);
		list.add(4);
		list.add("Radha");
		list.add(90);
		System.out.println("Enter Elements in the List:"+list);
		List<Object> list1 = list.stream().distinct().collect(Collectors.toList());
		System.out.println("After Removing Duplicates From List:"+list1);
	}


}
