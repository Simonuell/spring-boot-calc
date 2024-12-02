package com.example.calculator.controller;

import java.sql.Timestamp;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.calculator.Calculator;
import com.example.dbentity.CalculationRecord;
import com.example.repository.CalculationImplementation;
import com.example.repository.CalculationService;
import com.example.repository.CalculatorRepository;

@RestController
public record CalculatorController() {

    private final CalculationService calculationService;

    public CalculatorController(CalculationService calculationService){
        this.calculationService = calculationService;
    }
    @PostMapping("/add")
    public String addOperation(@RequestParam String firstNumber, @RequestParam int firstBase, @RequestParam String secondNumber, @RequestParam int secondBase, @RequestParam int resultBase){
        String result = Calculator.calculate(firstNumber, firstBase, secondNumber, secondBase, "+", resultBase);
        return "Calculated result: " + result;
        // Timestamp timestamp = new Timestamp(new Date().getTime());
        // CalculationService.saveCalculation(firstNumber, firstBase, secondNumber, secondBase, "+", resultBase, result, timestamp);
        CalculationRecord calcHistory = new CalculationRecord();
            calcHistory.setId(1);
            calcHistory.setFirstNumber(firstNumber);
            calcHistory.setFirstBase(firstBase);
            calcHistory.setSecondNumber(secondNumber);
            calcHistory.setSecondBase(secondBase);
            calcHistory.setTimestamp(new Timestamp(new Date().getTime()));
            calcHistory.setOperation("+");
            calculatorRepository.save(calcHistory);
        // record.setFirstNumber(firstNumber);
        // record.setFirstBase(firstBase);
        // record.setSecondNumber(secondNumber);
        // record.setSecondBase(secondBase);
        // record.setOperation("+");
        // record.setResultBase(resultBase);
        // record.setResult(result);
        // record.setTimestamp(new Timestamp(new Date().getTime());
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
