package com.deedee.dsalgo;

public class EuclidsAlgo {
    /*
    Euclid's Algorithm - this finds the greatest common divisor between 2 numbers

    Divide number 1 by number 2.
    if the remainder is 0, then number 2 is the gdc
    if the remainder is > 0, the goal is to continuously divide the divisor by the remainder until remainder = 0

    Hint - Number1 > number2 (always)
     */
    public int gcd(int number1, int number2)
    {
        if(number1 < number2) return 0;

        int remaining = number1 % number2;
        if(remaining == 0)
            return number2;

        return gcd(number2, remaining);

    }
}
