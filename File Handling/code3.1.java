import java.io.Serializable;

class Client implements Serializable
 {
    private String name;
    private int Id;
   transient  String sector;
    public Client (String name, int Id, String sector)
    {
        this.name = name;
        this.Id = Id;
        this.sector = sector;
    }
    public String getname()
    {
        return name;
    }
    public int getId()
    {
        return Id;
    }
    public String getsector()
    {
        return sector;
    }
   public String toString()
   {
    return "name ="+ name + "Id ="+ Id + "Sector"+sector;
   }
    
}
