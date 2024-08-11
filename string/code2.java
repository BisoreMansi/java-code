 class Code2 
{
    public static void main(String[] args) 
    {
        String s = "MANSIBISORE";
        String s1 = "Goood Morning";
        String s2 = "vansh";
        //length
        // System.out.println(s.length());
        // //charAt()
        // System.out.println(s.charAt(6));
        // System.out.println(s.substring(3));
        // System.out.println(s.substring(2,8));
        // System.out.println(s.concat(s1));
        // System.out.println(s.indexOf("BISORE"));//5
        // System.out.println(s.indexOf("Vinue"));//-1
        // System.out.println(s.indexOf("SI",3));//doubt
        // System.out.println(s.indexOf("R"));//9
        // System.out.println("vansh".equals("vansh"));
        // System.out.println("vansh".equalsIgnoreCase("vansh"));
       //11 System.out.println(s.compareTo(s1));
       System.out.println(s.toLowerCase());
       System.out.println(s1.toUpperCase());
       System.out.println(s.trim());
       System.out.println(s.replace("M", "v"));
       System.out.println(s.contains(s1));
       char ch[] = s.toCharArray();
       System.out.println(ch);
       System.out.println(s.startsWith("MA"));

        
    }
    
}
