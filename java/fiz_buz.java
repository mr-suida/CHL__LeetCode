
/*
  Given an integer n, return a string array answer (1-indexed) where:
  answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
  answer[i] == "Fizz" if i is divisible by 3.
  answer[i] == "Buzz" if i is divisible by 5.
  answer[i] == i (as a string) if none of the above conditions are true.

  date: ??/??/???? ??:?? PM/AM
  I'm: Normal?
  
  Runtime: 01 ms
  Memory Usage: 45.2 MB
  
*/

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> output = new ArrayList<String>(Collections.nCopies(n,""));
      
        while ( n > 0 ) {
            String tmp=( n%3 == 0 && n%5 == 0 ) ? "FizzBuzz" : (n%3 == 0) ? "Fizz" : (n%5 == 0) ? "Buzz" : Integer.toString(n);
            n -= 1;
            output.set(n,tmp);
        }
        
        return output;
    }
}
