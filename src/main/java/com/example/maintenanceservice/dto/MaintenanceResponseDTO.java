package com.example.maintenanceservice.dto;

import java.time.LocalDateTime;

public class MaintenanceResponseDTO {

    private Long id;
    private String roomNumber;
    private String problem;
    private String status;
    private boolean chambrePrete;
    private LocalDateTime dateIntervention;



    public MaintenanceResponseDTO() {
    }

    public MaintenanceResponseDTO(Long id,
                                  String roomNumber,
                                  String problem,
                                  String status,
                                  boolean chambrePrete,
                                  LocalDateTime dateIntervention) {
        this.id = id;
        this.roomNumber = roomNumber;
        this.problem = problem;
        this.status = status;
        this.chambrePrete = chambrePrete;
        this.dateIntervention = dateIntervention;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isChambrePrete() {
        return chambrePrete;
    }

    public void setChambrePrete(boolean chambrePrete) {
        this.chambrePrete = chambrePrete;
    }

    public LocalDateTime getDateIntervention() {
        return dateIntervention;
    }

    public void setDateIntervention(LocalDateTime dateIntervention) {
        this.dateIntervention = dateIntervention;
    }
}
