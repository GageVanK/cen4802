public class fib {
	public static void Main(Strings[] args) {
		
		System.out.println("The nth term of the Fibonacci sequence is y." + fibMethod(10));
	}
	
	public static int fibMethod(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fibMethod(n - 1) + fibMethod(n - 2);
    }
}

