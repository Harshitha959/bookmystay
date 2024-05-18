package com.bookmystay.entity;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "property_user")
public class PropertyUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long id;

   @Column(name = "first_name", nullable = false, length = 150)
    private String firstName;
   @Column(name = "last_name", nullable = false, length = 150)
    private String lastName;
   @Column(name = "username", nullable = false, unique = true, length = 150)
    private String username;
   @Column(name = "email", nullable = false, unique = true)
    private String email;

   @Column(name = "password", nullable = false, length = 20)
    private String password;

   @Column(name = "user_role", nullable = false, length = 20)
    private String userRole;
}
