package maven;

public abstract class Chocolates extends Gifts
{
     private int weight;
     private int Chocolate_content;
     private int price;
     private String chocolate_name;
     private String gift_type;

    public Chocolates(int Chocolate_content,int weight,int price,String chocolate_name,String gift_type)
    {
        super(price, weight, gift_type);
        this.chocolate_name =chocolate_name;
        this.Chocolate_content =Chocolate_content;
        this.weight = weight;
        this.price = price;
        this.gift_type=gift_type;
    }

    public int get_chocolate_content()
    {
        return  Chocolate_content;
    }

    public String get_type(){
        return gift_type;
    }
    public int get_weight()
    {
        return weight;
    }

    public int get_price()
    {
        return price;
    }

    public String get_choclate_name()
    {
        return chocolate_name;
    }

    abstract void description(); 
    public String toString()
    {
        return "Chocolate name: "+this.chocolate_name+"\n"+" Chocolate Content "+this.Chocolate_content+"\n"+" Chocolate price "+this.price+"\n"+" Chocolate weight "+this.weight+"\n";    }
} 