
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird[] eagles = new Eagle[2]; 
		eagles[0] = new Eagle(); 
		eagles[1] = new Eagle(); 
		
		for(Bird bird : eagles){
			bird.fly();
		}
	}

}
