package com.example.maintenanceservice.dto;
public class MaintenanceRequestDTO {

    private String roomNumber;
    private String problem;


    public MaintenanceRequestDTO() {
    }

    public MaintenanceRequestDTO(String roomNumber, String problem) {
        this.roomNumber = roomNumber;
        this.problem = problem;
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
}
