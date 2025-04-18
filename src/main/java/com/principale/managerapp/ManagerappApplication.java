package com.principale.managerapp;

import com.principale.managerapp.dao.ClientRepository;
import com.principale.managerapp.entity.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ManagerappApplication implements CommandLineRunner {


    @Autowired
    ClientRepository clientRepository;
    @Override
    public void run(String... args) throws Exception {
        clientRepository.save(new Client("Mon Entreprise", "Nongo", "monentreprise@gmail.com", "625363233", "Entreprise"));
    }

    public static void main(String[] args) {
        SpringApplication.run(ManagerappApplication.class, args);
    }

}
