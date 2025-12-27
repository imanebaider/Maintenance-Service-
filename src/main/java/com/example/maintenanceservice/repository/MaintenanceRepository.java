package com.example.maintenanceservice.repository;

import com.example.maintenanceservice.entity.Maintenance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaintenanceRepository
        extends JpaRepository<Maintenance, Long> {
}
