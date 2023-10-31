package com.example.exo2.services;

import org.springframework.stereotype.Service;

@Service
public class StudentsService implements Students{
    public String getNom(){
        return "Nom";
    }

    public String getPrenom(){
        return "prenom";
    }

    public int getAge(){
        return 0;
    }

    public int getId(){
        return 0;
    }
}
