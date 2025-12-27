package com.example.maintenanceservice.service;

import com.example.maintenanceservice.dto.MaintenanceRequestDTO;
import com.example.maintenanceservice.dto.MaintenanceResponseDTO;
import com.example.maintenanceservice.entity.Maintenance;
import com.example.maintenanceservice.mapper.MaintenanceMapper;
import com.example.maintenanceservice.repository.MaintenanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MaintenanceService {

    @Autowired
    private MaintenanceRepository repository;

    @Autowired
    private MaintenanceMapper mapper;

    // recevoirDemande
    public MaintenanceResponseDTO recevoirDemande(MaintenanceRequestDTO dto) {
        Maintenance m = mapper.toEntity(dto);
        Maintenance saved = repository.save(m);
        return mapper.toResponseDTO(saved);
    }

    // consulterProbleme
    public MaintenanceResponseDTO consulterProbleme(Long id) {
        Maintenance m = repository.findById(id).orElseThrow();
        return mapper.toResponseDTO(m);
    }

    // mettreAJourEtat
    public MaintenanceResponseDTO mettreAJourEtat(Long id, String status) {
        Maintenance m = repository.findById(id).orElseThrow();
        m.setStatus(status);
        Maintenance saved = repository.save(m);
        return mapper.toResponseDTO(saved);
    }

    // marquerChambrePrete
    public MaintenanceResponseDTO marquerChambrePrete(Long id) {
        Maintenance m = repository.findById(id).orElseThrow();
        m.setChambrePrete(true);
        m.setStatus("FIXED");
        Maintenance saved = repository.save(m);
        return mapper.toResponseDTO(saved);
    }
}

