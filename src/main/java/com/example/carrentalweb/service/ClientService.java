package com.example.carrentalweb.service;

import com.example.carrentalweb.model.Client;
import com.example.carrentalweb.repository.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {
    private final ClientRepository clientRepository;
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public Client insertClient(Client car) {
        return clientRepository.save(car);
    }
}
