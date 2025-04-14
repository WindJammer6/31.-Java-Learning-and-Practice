public class PrimeNumberChecker{

	// Testing the created function
	public static void main(String[] args) {

		System.out.println(isPrime(4));
		System.out.println(isPrime(7));
		System.out.println(isPrime(14));
		System.out.println(isPrime(23));
		System.out.println(isPrime(99));
		// Test case inputs: 4, 7, 14, 23, 99    Expected outputs: 0, 1, 0, 1, 0
	}

	public static int isPrime(int num){
		for (int i = 2; i < num; i++){
			if (num % i == 0){
				return 0;
			}
		}
		return 1;
	}
}
