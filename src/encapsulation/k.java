package encapsulation;

public class k  extends j {
    int add(int a,int b,int c ){
        System.out.println("the class b");
        return a+b+c;
    }

    float add(float a ,float b){
        System.out.println("class b float ");
        return a+b;

    }

    public static void main(String[] args) {
        j jak=new j();
        System.out.println(jak.add(10,20));
         k  jak1=new k();
        System.out.println(jak1.add(20,20,30));


    }
}
