@FunctionalInterface
interface Sample1 {
	public String method(int a, String b);
}
class Lamda1 {
	public static void main(String[] arga) {
		Sample1 s=(a,b)->
		{
			return a+" "+b;
			
		};
		System.out.println(s.method(101,"Pavan"));
		
	}
}