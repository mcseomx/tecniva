package com.tecn.ex1.model;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="userT")
@NoArgsConstructor 
@AllArgsConstructor 
@Data
public class User {	

	@Id
    private Long id;  
    private String firstName;
    private String midName;
    private String lastName;
    private String email;
    private LocalDate birth;
 

  
}
