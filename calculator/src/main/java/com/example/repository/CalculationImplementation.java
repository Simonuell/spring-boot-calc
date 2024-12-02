package com.example.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dbentity.CalculationRecord;

@Service
public class CalculationImplementation implements CalculationService {
    private final CalculatorRepository calculatorRepository;

    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    public CalculationImplementation(CalculatorRepository calculatorRepository){
        this.calculatorRepository = calculatorRepository;
    }

    @Override
    public CalculationRecord saveCalculationRecord(CalculationRecord calculationRecord){
        return calculatorRepository.save(calculationRecord);
    }

}
