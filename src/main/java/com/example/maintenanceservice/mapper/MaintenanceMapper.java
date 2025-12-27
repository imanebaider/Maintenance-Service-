package com.example.maintenanceservice.mapper;

import com.example.maintenanceservice.dto.MaintenanceRequestDTO;
import com.example.maintenanceservice.dto.MaintenanceResponseDTO;
import com.example.maintenanceservice.entity.Maintenance;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class MaintenanceMapper {

    public Maintenance toEntity(MaintenanceRequestDTO dto) {
        Maintenance m = new Maintenance();
        m.setRoomNumber(dto.getRoomNumber());
        m.setProblem(dto.getProblem());
        m.setStatus("PENDING");
        m.setChambrePrete(false);
        m.setDateIntervention(LocalDateTime.now());
        return m;
    }

    public MaintenanceResponseDTO toResponseDTO(Maintenance m) {
        MaintenanceResponseDTO dto = new MaintenanceResponseDTO();
        dto.setId(m.getId());
        dto.setRoomNumber(m.getRoomNumber());
        dto.setProblem(m.getProblem());
        dto.setStatus(m.getStatus());
        dto.setChambrePrete(m.isChambrePrete());
        dto.setDateIntervention(m.getDateIntervention());
        return dto;
    }
}
