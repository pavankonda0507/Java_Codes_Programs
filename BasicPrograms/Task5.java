package BasicPrograms;

class Task5 {

	public static void main(String[] args) {
		int num1 = 100,num2 = 100, i=1, j=1, sum = 0, prod = 1;
		while(i<=num1) {
			if(i%2==0){
			sum = sum+i;
			}
			i++;
		}
		System.out.println("The sum is: "+sum);

		while(j<=num2) {
			if(j%2!=0){
			prod = prod*i;
			}
			j++;
		}
		System.out.println("The product is: "+prod);

	}
}

