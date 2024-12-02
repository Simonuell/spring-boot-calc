package com.example.repository;

import org.springframework.stereotype.Service;

import com.example.dbentity.CalculationRecord;

@Service
public interface CalculationService {
    // List<CalculationRecord> findAllRecords();
    CalculationRecord saveCalculationRecord(CalculationRecord calculationRecord);
    // @Autowired
    // private CalculatorRepository repository;

    // public CalculationRecord saveCalculation(String firstNumber, int firstBase, String secondNumber, int secondBase, String operation, int resultBase, String result, Timestamp timestamp)  {
    //     CalculationRecord record = new CalculationRecord();
    //     record.setFirstNumber(firstNumber);
    //     record.setFirstBase(firstBase);
    //     record.setSecondNumber(secondNumber);
    //     record.setSecondBase(secondBase);
    //     record.setOperation(operation);
    //     record.setResultBase(resultBase);
    //     record.setResult(result);
    //     record.setTimestamp(new Timestamp(new Date().getTime()));

    //     return repository.save(record);
    // }
}