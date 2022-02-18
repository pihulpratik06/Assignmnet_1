package JDK;

enum Traffic{
     Green("Go"),Red("Stop"),Orange("Go Slow") ; 
   
     private String act;
      Traffic(String act){
            
        this.act=act;
      }
      public String pplAct(){
           return act;
      }
    


} 
class EnumDemo{
    public static void main(String[] args) {
        
    Traffic[] sg=Traffic.values();

    for (Traffic traffic : sg) {
            System.out.println(traffic.name()+" Action:"+traffic.pplAct());
    }



    }
}


/*
 * Output***********
 * 
 * Green Action:Go 
 * Red Action:Stop
 *  Orange Action:Go Slow
 * 
 * 
 * 
 */