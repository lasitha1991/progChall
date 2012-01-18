public class Park{
	public static void main(String[] args){
		
	}
	public void simulatePark (){
		Animal a[]=new Animal[5];
		a[0]=new Dog("Tommy",2);
		a[1]=new Dog("Micky",3");
		a[2]=new Dog("Blacky",2);
		a[3]=new Dog("Snowy",1);
		a[4]=new Dog("Terry",2);
		for(int i=0;i<5;i++){
			System.out.println("Animal "+a[i].giveName()+" is "+a[i].makeNoice());
		}
	}
}