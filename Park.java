public class Park{
	public static void main(String[] args){
		Park p1=new Park();
		p1.simulatePark();		
	}
	public void simulatePark (){
		Animal a[]=new Animal[5];
		Thread t[]=new Thread[5];
		a[0]=new Dog("Tommy",2);
		a[1]=new Dog("Micky",3);
		a[2]=new Cat("Kitty",2);
		a[3]=new Dog("Snowy",1);
		a[4]=new Cat("Pussy",2);
		for(int i=0;i<5;i++){
			t[i]=new Thread(a[i]);
		        t[i].start();
			System.out.println("Animal "+a[i].giveName()+" is "+ a[i].giveAge()+"Years old");
		}
	}
}