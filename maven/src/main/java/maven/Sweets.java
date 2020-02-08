package maven;

public abstract class Sweets extends Gifts
{
   private int sugar_content;
   private int weight;
   private int price;
   private String sweetname;
   private String type;
   public Sweets(int sugar_content,int weight,int price,String sweetname,String type)
   {
       super(price,weight,type);
       this.sugar_content=sugar_content;
       this.weight=weight;
       this.price=price;
       this.sweetname=sweetname;
       this.type=type;
   }
   public String get_sweetname()
   {
       return sweetname;
   }
    public int get_sugarcontent()
    {
        return sugar_content;
    } 
    public int get_weight()
    {
        return weight;
    }
    public int get_price()
    {
        return price;
    }
abstract void description();
 
@Override
 public String toString() {
     return " My name is "+this.sweetname+":  weight is "+this.weight+" Sweet content "+this.sugar_content+ " Sweet weight "+this.weight+" it costs around $ "+this.price+"\n";
 }
 
}