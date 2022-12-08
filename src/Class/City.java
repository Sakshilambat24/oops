package Class;

public class City{

    class colony{
        int colonyId=100;
        String colonyName="fc road";
    }
}

        class corporation {
         String name = "pune corp";
         static String citycorp = "city corp";


         public static void main(String[] args) {

             class local{
                 int local=100;

             }
             local L=new local();
             System.out.println(L.local);

             City city=new City();
             City.colony c= city.new colony();

             System.out.println(c.colonyId+"\t"+c.colonyName);

            // City.corporation.C = new City.corpation();
           //
             //  System.out.println(C.name);
             //System.out.println(City.corporation .citycrop);







         }

     }