public abstract class Animal {
    private String name;
    private int age;
    public Animal(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String giveName (){
        return name;
    }
    public int giveAge (){
        return age;
    }
    public abstract void makeNoice ();
}
