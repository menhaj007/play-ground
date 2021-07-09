package com.javareact.jrct.controllers;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import com.javareact.jrct.models.Client;
import com.javareact.jrct.repositories.ClientRepository;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/clients")
public class ClientsController {

    private final ClientRepository clientRepository;

    public ClientsController(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @GetMapping
    public List<Client> getClients() {
        return clientRepository.findAll();
    }

    @GetMapping("/{id}")
    public Client getClient(@PathVariable Long id) {
        return clientRepository.findById(id).get();
    }

    @PostMapping
    public Client createClient(@RequestBody Client client) throws URISyntaxException {
        // Client savedClient = clientRepository.save(client);
        // return ResponseEntity.created(new URI("/clients/" + savedClient.getId())).body(savedClient);
        return clientRepository.save(client);
    }

    @PutMapping("/{id}")
    public Client updateClient(@PathVariable Long id, @RequestBody Client client) {
        Client currentClient = clientRepository.findById(id).get();
        if (currentClient != null) {
            currentClient.setName(client.getName());
            currentClient.setEmail(client.getEmail());
            currentClient = clientRepository.save(client);
        }
        return currentClient;

        // return ResponseEntity.ok(currentClient);


    }

    @DeleteMapping("/{id}")
    public Client deleteClient(@PathVariable Long id) {
        clientRepository.deleteById(id);
        // return ResponseEntity.ok().build();
        return clientRepository.findById(id).get();
    }
}