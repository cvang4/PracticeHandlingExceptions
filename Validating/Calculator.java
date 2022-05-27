package Validating;

public class Calculator {

    public int factorial(int num) {

        //Parameters cannot be a negative number.
        if(num < 0) {
            throw new IllegalArgumentException("Number must be 0 or greater!");
        }

        int answer = 1;
        for (int i = 1; i <= num; i++) {
            answer *= i;
        }

        return answer;
    }

    public int binomialCoefficent(int setSize, int subsetSize) {

        //Parameters cannot be a negative number and subset size should not exceed set size.
        if(setSize < 0 || subsetSize < 0 || setSize < subsetSize) {
            throw new IllegalArgumentException("Number must be 0 or greater. Subset size should not exceed set size.");
        }

        int numerator = factorial(setSize);
        int denominator = factorial(subsetSize) * factorial(setSize - subsetSize);

        return numerator / denominator;
    }
}
