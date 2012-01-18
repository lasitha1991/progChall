public class Dog extends Animal{
    public Dog(String name,int age){
        super(name,age);
    }
    public void makeNoice() {
        System.out.println(super.giveName()+" is Barking"); 
    }
}
