package com.example.repository;

import org.springframework.beans.factory.annotation.Autowired;

// import java.sql.Timestamp;
// import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.dbentity.CalculationRecord;

@Repository
public interface CalculatorRepository extends JpaRepository<CalculationRecord, Long> {

}
// public interface CalculatorRepository {
//     int save(CalculationRecord calcHistory);
//     List<CalculationRecord> findAll(Timestamp fromDate, Timestamp toDate) throws Exception;
// }

