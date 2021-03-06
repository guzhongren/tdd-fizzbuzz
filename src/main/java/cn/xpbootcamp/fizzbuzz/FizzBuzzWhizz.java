package cn.xpbootcamp.fizzbuzz;

import static java.lang.String.valueOf;

public class FizzBuzzWhizz {
    private int num;

    private String FIZZ = "Fizz";
    private String BUZZ = "Buzz";
    private String WHIZZ = "Whizz";

    public FizzBuzzWhizz(int num) {
        this.num = num;
    }

    public String say() {
        if(isDividedBy(3) && isDividedBy(5) && isDividedBy(7)) return this.FIZZ + this.BUZZ + this.WHIZZ;
        if(isDividedBy(3) && isDividedBy(5)) return this.FIZZ + this.BUZZ;
        if(isDividedBy(7)) return this.WHIZZ;
        if(isDividedBy(5)) return this.BUZZ;
        if(isDividedBy(3)) return this.FIZZ;
        return valueOf(this.num);
    }

    private boolean isDividedBy(int i) {
        return this.num % i == 0;
    }
}
