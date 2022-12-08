package ObjectClass;

public class ToString {
    public static void main(String[] args) {
        ToString ts=new ToString();
        System.out.println(ts);
        System.out.println(ts.toString());
        System.out.println();
       // String classname=ToString.getClass().getName();
        int hashCode =ts.hashCode();
        String hashCodeInHexaDecimal = Integer.toHexString(hashCode);

       // System.out.println(className + "@"+hashCodeInHexaDecimal);
    }
}

