package com.principale.managerapp.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.io.Serializable;
@Entity
@Table(name = "clients")
public class Client implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(length = 45, unique = true)
    @NotBlank(message = "Le champ est obligatoire")
    @Size(min = 2, max = 45, message ="Le champ doit contenir au moins un caractère")
    private String nom;
    @Column(length = 90, unique = true)
    @NotBlank(message = "Le champ addresse est obligatoire")
    @Size(min = 4, max = 90, message = "Le champ doit contenir minimum 4 caractère")
    private String addresse;
    @Column(length = 90, unique = true)
    @NotBlank(message = "Le champ email est obligatoire")
    @Email(message = "Le champ email doit contenir @")
    private String email;
    @Column(length = 9, unique = true)
    @NotBlank(message = "Le champ contact doit etre obligatoire")
    @Size(min = 9, max = 14, message = "Le champ Contact doit contenir au moins 3 caractère")
    private String contact;
    @Column(length = 50)
    @NotBlank(message = "Le champ type est obligatoire")
    @Size(min = 4, max = 50, message = "Le champ type doit contenir au moins 4 caractères")
    private String type;

    public Client() {
    }

    public Client(String nom, String addresse, String email, String contact, String type) {
        this.nom = nom;
        this.addresse = addresse;
        this.email = email;
        this.contact = contact;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public @NotBlank(message = "Le champ est obligatoire") @Size(min = 2, max = 45, message = "Le champ doit contenir au moins un caractère") String getNom() {
        return nom;
    }

    public @NotBlank(message = "Le champ addresse est obligatoire") @Size(min = 4, max = 90, message = "Le champ doit contenir minimum 4 caractère") String getAddresse() {
        return addresse;
    }

    public @NotBlank(message = "Le champ email est obligatoire") @Email(message = "Le champ email doit contenir @") String getEmail() {
        return email;
    }

    public @NotBlank(message = "Le champ contact doit etre obligatoire") @Size(min = 9, max = 14, message = "Le champ Contact doit contenir au moins 3 caractère") String getContact() {
        return contact;
    }

    public @NotBlank(message = "Le champ type est obligatoire") @Size(min = 4, max = 50, message = "Le champ type doit contenir au moins 4 caractères") String getType() {
        return type;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(@NotBlank(message = "Le champ est obligatoire") @Size(min = 2, max = 45, message = "Le champ doit contenir au moins un caractère") String nom) {
        this.nom = nom;
    }

    public void setAddresse(@NotBlank(message = "Le champ addresse est obligatoire") @Size(min = 4, max = 90, message = "Le champ doit contenir minimum 4 caractère") String addresse) {
        this.addresse = addresse;
    }

    public void setEmail(@NotBlank(message = "Le champ email est obligatoire") @Email(message = "Le champ email doit contenir @") String email) {
        this.email = email;
    }

    public void setContact(@NotBlank(message = "Le champ contact doit etre obligatoire") @Size(min = 9, max = 14, message = "Le champ Contact doit contenir au moins 3 caractère") String contact) {
        this.contact = contact;
    }

    public void setType(@NotBlank(message = "Le champ type est obligatoire") @Size(min = 4, max = 50, message = "Le champ type doit contenir au moins 4 caractères") String type) {
        this.type = type;
    }
}
