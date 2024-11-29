package com.example.calculator.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.calculator.Calculator;

@RestController
public record CalculatorController() {
    
    @PostMapping("/add")
    public String addOperation(@RequestParam String firstNumber, @RequestParam int firstBase, @RequestParam String secondNumber, @RequestParam int secondBase, @RequestParam int resultBase){
        String result = Calculator.calculate(firstNumber, firstBase, secondNumber, secondBase, "+", resultBase);
        return "Calculated result: " + result;
        
    }

    @PostMapping("/minus")
    public String minusOperation(@RequestParam String firstNumber, @RequestParam int firstBase, @RequestParam String secondNumber, @RequestParam int secondBase, @RequestParam int resultBase){
        String result = Calculator.calculate(firstNumber, firstBase, secondNumber, secondBase, "-", resultBase);
        return "Calculated result: " + result;

    }

    @PostMapping("/multiply")
    public String multiplyOperation(@RequestParam String firstNumber, @RequestParam int firstBase, @RequestParam String secondNumber, @RequestParam int secondBase, @RequestParam int resultBase){
        String result = Calculator.calculate(firstNumber, firstBase, secondNumber, secondBase, "*", resultBase);
        return "Calculated result: " + result;

    }

    @PostMapping("/divide")
    public String divideOperation(@RequestParam String firstNumber, @RequestParam int firstBase, @RequestParam String secondNumber, @RequestParam int secondBase, @RequestParam int resultBase){
        String result = Calculator.calculate(firstNumber, firstBase, secondNumber, secondBase, "/", resultBase);
        return "Calculated result: " + result;

    }
}
