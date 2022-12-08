package encapsulation;

public class student {
    private int id;
    private String name;


    public student (int id ,String name){
        this.id=id;
        this.name=name;
    }

    public student(){

    }

    public int getid ( ){
        return id;
    }

    public  int   setid(int id){
         return this.id=id;

    }
    public String getname ( ){
        return name;
    }

    public void setname(String  name) {
        this.name = name;
    }

    }


