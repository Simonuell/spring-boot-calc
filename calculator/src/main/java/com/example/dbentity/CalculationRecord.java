package com.example.dbentity;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "calculation_record")
public class CalculationRecord {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "firstNumber")
    private String firstNumber;
    @Column(name = "firstBase")
    private int firstBase;
    @Column(name = "secondNumber")
    private String secondNumber;
    @Column(name = "secondBase")
    private int secondBase;
    @Column(name = "operation")
    private String operation;
    @Column(name = "resultBase")
    private int resultBase;
    @Column(name = "result")
    private String result;
    @Column(name = "timestamp")
    private Timestamp timestamp;

    // Геттеры и сеттеры

    public CalculationRecord(String firstNumber, int firstBase, String secondNumber, int secondBase, String operation, int resultBase, String result, Timestamp timestamp) {
        this.id = id;
        this.firstNumber = firstNumber;
        this.firstBase = firstBase;
        this.secondNumber = secondNumber;
        this.secondBase = secondBase;
        this.operation = operation;
        this.resultBase = resultBase;
        this.result = result;
        this.timestamp = timestamp;
    }

    public CalculationRecord(){}

    public Long getId() {
        return id;
    }
    public void setId(long historyId) {
        this.id = id;
    }
    public String getFirstNumber() {
        return firstNumber;
    }
    public void setFirstNumber(String firstNumber) {
        this.firstNumber = firstNumber;
    }
    public int getFirstBase() {
        return firstBase;
    }
    public void setFirstBase(int firstBase) {
        this.firstBase = firstBase;
    }
    public String getSecondNumber() {
        return secondNumber;
    }
    public void setSecondNumber(String secondNumber) {
        this.secondNumber = secondNumber;
    }
    public int getSecondBase() {
        return secondBase;
    }
    public void setSecondBase(int secondBase) {
        this.secondBase = secondBase;
    }
    public Timestamp getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
    public String getOperation() {
        return operation;
    }
    public void setOperation(String operation) {
        this.operation = operation;
    }
    public String getResult() {
        return result;
    }
    public void setResult(String result) {
        this.result = result;
    }
    public int getResultBase() {
        return resultBase;
    }
    public void setResultBase(int resultBase) {
        this.resultBase = resultBase;
    }
}