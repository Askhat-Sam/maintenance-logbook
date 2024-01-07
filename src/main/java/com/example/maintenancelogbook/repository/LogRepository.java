package com.example.maintenancelogbook.repository;

import com.example.maintenancelogbook.entity.Log;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogRepository extends JpaRepository<Log, Long> {
}
