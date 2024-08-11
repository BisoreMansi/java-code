interface length
{
   int getstrlength(int h);
    
}

 class code2 
{
    // private int getstrlength(String str)
    // {
    //     return str.length();
    // }

    // str -> str.length();
    public static void main(String[] args) 
    {
        // code2 c = new code2();
        // c.getstrlength("mansi");
        length l = (int h)->
        {
            System.out.println("Length :"+ h);
             return h;

        };
        
        l.getstrlength(5);
    }
    
}
