class Solution {
    public List<String> fizzBuzz(int n) {
          List<String> names= new ArrayList<>();
          String s;
        for(int i=1;i<=n;i++)
        {
            if(i%3==0&& i%5==0)
                names.add("FizzBuzz");
                else if(i%3==0)
                names.add("Fizz");
                else if(i%5==0)
                names.add("Buzz");
                else
                names.add(String.valueOf(i));


        }
        return names;
        
    }
}