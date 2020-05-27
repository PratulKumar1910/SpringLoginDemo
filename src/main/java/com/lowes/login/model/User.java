package com.lowes.login.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = 'usersDB')
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private int id;

    @Column(name = "user_name")
    @Length(min = 5, message = "Username must be atleast of 6 characters")
    @NotEmpty(message = "Please provide a Username")
    private String userName;

    @Column(name = "email")
    @Email(message = "Please provide a valid Email")
    @NotEmpty(message = "Please provide an Email ID")
    private String email;

    @Column(name = "password")
    @NotEmpty(message = "Please provide your password")
    private String password;

    @Column(name = "name")
    @NotEmpty(message = "Please provide your name")
    private String name;

    @Column(name = "last_name")
    @NotEmpty(message = "Please provide your last name")
    private String lastName;

    @Column(name = "roles")
    private String roles;
}
