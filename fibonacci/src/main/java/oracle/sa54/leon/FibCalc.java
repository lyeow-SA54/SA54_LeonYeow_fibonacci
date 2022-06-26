package oracle.sa54.leon;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FibCalc {
	static int fib(int n)
    {
  
        // Declare an array to store
        // Fibonacci numbers.
        // 1 extra to handle case, n = 0
        int f[] = new int[n + 2];
  
        int i;
  
        // 0th and 1st number of
        // the series are 0 and 1
        f[0] = 0;
        f[1] = 1;
  
        for (i = 2; i <= n; i++) {
  
            // Add the previous 2 numbers
            // in the series and store it
            f[i] = f[i - 1] + f[i - 2];
        }
  
        // Nth Fibonacci Number
        return f[n];
    }
	
	static List<Long> fibonacciReturnSorted(List<Long> fibList)
	{
		List<Long> evenSorted = new ArrayList<Long>();
		List<Long> oddSorted = new ArrayList<Long>();
		
		for (int i = fibList.size(); i-- > 0; ) {
			if (fibList.get(i)%2==0)
			{
				evenSorted.add(fibList.get(i));
			}
			else
			{
				oddSorted.add(fibList.get(i));
			}
		}
		List<Long> newList = Stream.concat(evenSorted.stream(), oddSorted.stream())
				   .collect(Collectors.toList());
		return newList;
	}
}
