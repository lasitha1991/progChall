public class Cat extends Animal{
    public Cat(String name,int age){
        super(name,age);
    }
    public void makeNoice() {
        System.out.println(super.giveName()+" mieaw"); 
    }
}