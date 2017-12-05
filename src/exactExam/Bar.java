package exactExam;

public class Bar extends Foo {

	public int a=8;
	public void addFive() {
		this.a +=5;
		System.out.println("b ");
	}
	
	public static void main(String[] args) {
		Foo f = new Bar();
		Bar b = new Bar();
		boolean bool= false;
		f.addFive();
		System.out.println(f.a);
		System.out.println("*********");
		b.addFive();
		System.out.println(b.a);
		
		if(bool=true){
			System.out.println("l'affectation marche dans le si");
		}
	}

}
