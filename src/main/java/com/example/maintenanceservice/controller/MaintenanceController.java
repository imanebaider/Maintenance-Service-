package com.example.maintenanceservice.controller;
import com.example.maintenanceservice.dto.MaintenanceRequestDTO;
import com.example.maintenanceservice.dto.MaintenanceResponseDTO;
import com.example.maintenanceservice.service.MaintenanceService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/maintenance")
@Tag(name = "Maintenance API", description = "Endpoints for managing maintenance requests")
public class MaintenanceController {

    @Autowired
    private MaintenanceService service;

    @Operation(
            summary = "Receive a new maintenance request",
            description = "Creates a new maintenance request based on room number and problem description."
    )
    @PostMapping("/recevoir")
    public MaintenanceResponseDTO recevoirDemande(
            @Parameter(description = "Maintenance request data", required = true)
            @RequestBody MaintenanceRequestDTO dto) {
        return service.recevoirDemande(dto);
    }

    @Operation(
            summary = "Get maintenance request by ID",
            description = "Retrieve a maintenance request using its unique ID."
    )
    @GetMapping("/{id}")
    public MaintenanceResponseDTO consulterProbleme(
            @Parameter(description = "ID of the maintenance request", required = true)
            @PathVariable Long id) {
        return service.consulterProbleme(id);
    }

    @Operation(
            summary = "Update the status of a maintenance request",
            description = "Update the status field (PENDING, IN_PROGRESS, FIXED) for a given maintenance request."
    )
    @PutMapping("/etat/{id}")
    public MaintenanceResponseDTO mettreAJourEtat(
            @Parameter(description = "ID of the maintenance request", required = true)
            @PathVariable Long id,
            @Parameter(description = "New status of the maintenance request", required = true)
            @RequestParam String status) {
        return service.mettreAJourEtat(id, status);
    }

    @Operation(
            summary = "Mark the room as ready",
            description = "Set the 'chambrePrete' flag to true for a given maintenance request."
    )
    @PutMapping("/chambre-prete/{id}")
    public MaintenanceResponseDTO marquerChambrePrete(
            @Parameter(description = "ID of the maintenance request", required = true)
            @PathVariable Long id) {
        return service.marquerChambrePrete(id);
    }
}
