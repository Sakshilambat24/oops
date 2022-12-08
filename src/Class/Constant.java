package Class;

public class Constant {

    static class Mysql{
        static String username="mysql";
        static String password="admin123";

    }
    static class Oracle{
        static String username="oracle";
        static String password="admin123";

    }

    static class posgress{
        static class Dev{
            static String username="dev";
            static String password="dev123";

        }

        static class prod{
            static String username="prod";
            static String password="prod123";

      }

        public static void main(String[] args) {
            System.out.println("Mysql usename"+Constant.Mysql.username);
            System.out.println("Mysql password"+Constant.Mysql.password);

            System.out.println("oracle username"+Constant.Oracle.username);
            System.out.println("oracle password"+ Oracle.password);

            System.out.println("posgress dev username"+Constant.posgress.Dev.username);
            System.out.println("podgress dev username"+Constant.posgress.Dev.password);

        }

    }
}

