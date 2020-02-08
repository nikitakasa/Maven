package maven;
import java.util.*;
class ChocolateCompartor implements Comparator<Gifts>
{

	public int compare(Gifts o1, Gifts o2) {
		 if(o1.get_type().equals("Chocolates") && o2.get_type().equals("Chocolates") )
			    return o1.get_weight()-o2.get_weight();
	        return 0;

	}

  
}