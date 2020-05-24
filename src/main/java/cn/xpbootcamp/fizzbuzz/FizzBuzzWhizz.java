package cn.xpbootcamp.fizzbuzz;

import static java.lang.String.valueOf;

public class FizzBuzzWhizz {
    private int num;

    private String FIZZ = "Fizz";
    private String BUZZ = "Buzz";

    public FizzBuzzWhizz(int num) {
        this.num = num;
    }

    public String say() {
        if(this.num % 5 == 0) return this.BUZZ;
        if(this.num % 3 == 0) return this.FIZZ;
        return valueOf(this.num);
    }
}
