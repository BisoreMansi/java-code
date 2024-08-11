

 class Ass {
    
    int ans,num=1;
    public void check(){
        do{
           if( num%3==0){
            System.out.print(num);
           }
          else if( num%5==0){
            System.out.print(num);
           }
          else if( num%5==0 && num%3==0){
            System.out.print(num);
           }
           num++;
        }while(num<100);
        
        
    
    
}

public static void main(String[] args) {
    Ass obj = new Ass();
    obj.check();
}


    
}
