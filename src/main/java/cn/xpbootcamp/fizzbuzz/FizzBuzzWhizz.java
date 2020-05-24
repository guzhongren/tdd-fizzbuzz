package cn.xpbootcamp.fizzbuzz;

import static java.lang.String.valueOf;

public class FizzBuzzWhizz {
    private int num;
    public FizzBuzzWhizz(int num) {
        this.num = num;
    }

    public String say() {
        return valueOf(this.num);
    }
}
