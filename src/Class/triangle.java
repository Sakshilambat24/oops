package Class;

public class triangle {
    int length=3;
    int breath=4;
     int height =9;

    public float  area(){
        int areaoftriangle=1/2*breath*height;

        return areaoftriangle;

    }
     public int perimeter(){
        int areaperimeter=length+breath+height;
        return areaperimeter;
     }

    public static void main(String[] args) {
        triangle triangle1=new triangle();
        //triangle1.area();
        System.out.println( "area of perimeter is :"+triangle1.perimeter());
        System.out.println("area of triangle is:"+triangle1.area());

    }
}

