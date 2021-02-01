//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Jacob Merioles
//Date - 2/1/2021

import java.util.List;
import java.util.ArrayList;

public class ListLast
{
	public static boolean go(List<Integer> ray)
	{
    if (ray.size() == 0 || ray.size() == 1){
      return false; }
    int lastNum = ray.get(ray.size()-1);
    for (int i = 0; i <= ray.size()-2; i++)
    {
      if (ray.get(i) == lastNum){
        return true; }
    }
		return false;
	}
}