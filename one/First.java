package one;

public class First {
	int x = 10;
	private int y = 20;
	protected int z = 30;
	public int k = 40;
	public static void main(String[] args) {
		First o = new First();
		System.out.println(o.x);
		System.out.println(o.y);
		System.out.println(o.z);
		System.out.println(o.k);
		
	}
}
class Mod {
	public static void main(String[] args) {
		First f = new First();
		System.out.println(f.x);
		//System.out.println(f.y);
		System.out.println(f.z);
		System.out.println(f.k);
	}
}
