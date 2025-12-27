package com.example.maintenanceservice.entity;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "maintenances")
public class Maintenance {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "room_number", nullable = false)
    private String roomNumber;

    @Column(nullable = false, length = 500)
    private String problem;

    @Column(nullable = false)
    private String status; // PENDING, IN_PROGRESS, FIXED

    @Column(name = "chambre_prete")
    private boolean chambrePrete;

    @Column(name = "date_intervention")
    private LocalDateTime dateIntervention;



    public Maintenance() {
    }

    public Maintenance(String roomNumber, String problem, String status,
                       boolean chambrePrete, LocalDateTime dateIntervention) {
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
