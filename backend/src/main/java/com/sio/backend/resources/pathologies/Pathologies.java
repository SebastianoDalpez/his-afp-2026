package com.sio.backend.resources.pathologies;


import java.time.Instant;
import jakarta.persistance.Column;
import jakarta.persistance.Size;
import jakarta.persistance.NotNull;



@Getter
@Setter
//Creazione Entity e collegamento alla relativa tabella nel DB
@Entity
@Table(name = "pathologies", schema = "sio") //relativa tabella corrispondente nel DB
public class Pathologies {

   

    @Id
    @Size(max = 10)
    @NotNull
    @Column(name = "code", nullable = false, length = 10) 
    private String code;

    @Size(max = 100)
    @NotNull
    @Column(name = "description", nullable = false, length = 100) 
    private String description;


    private Instant createdAt;

    // // metodi Getter e Setter
    // public String getCode(){    
    //     return code; 
    // }
    // public void setCode(String code){
    //     this.code = code; 
    // }
    // public String getDescription() {
    //     return description;
    // }
    // public void setDescription(String description) {
    //     this.description = description;
    // }
    // public Instant getCreatedAt() {
    //     return createdAt;
    // }
    // public void setCreatedAt(Instant createdAt) {
    //     this.createdAt = createdAt;
    // }
}