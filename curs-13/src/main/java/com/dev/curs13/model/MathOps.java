package com.dev.curs13.model;

import lombok.Data;

@Data
public class MathOps {
    private double firstNumber;
    private double secondNumber;
    private String operation;

    public double mathOperation(Double firstNumber, Double secondNumber, String operation) {
        double result = 0;

        switch (operation) {
            case "sum":
                result = firstNumber + secondNumber;
                break;
            case "difference":
                result = firstNumber - secondNumber;
                break;
            case "multiply":
                result = firstNumber * secondNumber;
                break;
            case "divide":
                if (secondNumber != 0) {
                    result = firstNumber / secondNumber;
                } else {
                    throw new IllegalArgumentException("Cannot divide by zero");
                }
                break;
            case "power":
                result = Math.pow(firstNumber, secondNumber);
                break;
            default:
                throw new IllegalArgumentException("Invalid operation: " + operation);
        }

        return result;
    }
}