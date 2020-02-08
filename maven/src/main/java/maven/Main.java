package maven;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main
{
	static int get_totalweight(ArrayList<Gifts> al)
	{
	    int totalweight = 0;
	    for(Gifts i : al)
	    {
	        totalweight+= i.get_weight();
	    }
	    return totalweight;
	}
	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
    int sugarcontent = 0;
    int weight = 0;
    int price = 0;
    String sweetname="";
    int chocolatecontent = 0;
    int choco_weight = 0;
    int choco_price = 0;
    String Choco_name = "";
    String type="";
    System.out.println("Enter the number of gifts");
    int n =sc.nextInt();
    ArrayList<Gifts> list =new ArrayList<Gifts>();
    for(int i=0;i<n;i++)
    {
          System.out.println("Enter the type of Gift");
          type=sc.next();
          if(type.equals("Chocolates"))
          {
              System.out.println("Enter the chocolatecontent");
            chocolatecontent = sc.nextInt();
            System.out.println("Enter the weight ");
            choco_weight = sc.nextInt();
            System.out.println("Enter the price ");
            choco_price = sc.nextInt();
            System.out.println("Enter the Chocolatename");
            Choco_name =sc.next();
            if(Choco_name.equals("Candies")){
            	Candies c= new Candies(chocolatecontent, choco_weight, choco_price, Choco_name, type);
                 list.add(c);
            }else if(Choco_name.equals("Gems")) {
               Gems g= new Gems(chocolatecontent, choco_weight, choco_price, Choco_name, type);
            	list.add(g);
            }else{
            	 Toffees t= new Toffees(chocolatecontent, choco_weight, choco_price, Choco_name, type);
             	list.add(t);
            }
           
          }else {
        	  System.out.println("Enter the SugarContent of "+type);
              sugarcontent = sc.nextInt();
              System.out.println("Enter the weight ");
              weight = sc.nextInt();
              System.out.println("Enter the price ");
              price = sc.nextInt();
              System.out.println("Enter the sweetname");
              sweetname =sc.next();
              if(sweetname.equals("DryFruitSweets"))
              {
            	  DryFruitSweets d =new DryFruitSweets(sugarcontent, weight, price, sweetname, type);
                  list.add(d);
              }
              else {
            	  IndianSweets s=new IndianSweets(sugarcontent,weight, price, sweetname, type);
                  list.add(s);
              }
          }  
    }
    int totalweight = get_totalweight(list);
    System.out.println("The Total Weight is "+totalweight);
   
    Collections.sort(list,new ChocolateCompartor());
    System.out.println("After Sorting the Chocolates based on Weights");
    for(Gifts c: list)
    {
        if(c.get_type().equals("Chocolates"))
        System.out.println(c);
    }
    System.out.println("Enter the min value for range of weights");
    int min = sc.nextInt();
    System.out.println("Enter the max value for range of weights");
    int max = sc.nextInt();
    System.out.println("Gifts in the range ");
    for(Gifts g : list)
    {
        if(g.get_weight()>=min && g.get_weight()<=max)
        {
            System.out.println(g);
        }
    }
    sc.close();
	}
}