package Class;

public class perimeterTriangle {
    int length;
    int base;
    int height;

    public perimeterTriangle(int length, int base, int height) {
        this.length = length;
        this.base = base;
        this.height = height;
    }

    public int area(){
       int areaoftriangle=1/2*base*height;
       return areaoftriangle;
    }
    public int perimeter(){
        int areaperimeter=length+base+height;
        return areaperimeter;
    }

    public static void main(String[] args) {
        perimeterTriangle perimeterTriangle1=new perimeterTriangle(2,3,5);
        System.out.println("the area of traingle:"+perimeterTriangle1.area());
        System.out.println("the area of perimeter:"+perimeterTriangle1.perimeter());

    }


}
