package com.tomo.tvpetclinic.services;

import com.tomo.tvpetclinic.model.Vet;

import java.util.Set;

public interface VetService
{
    Vet findByLastName(String lastName);

    Vet findById(Long id);

    Vet save(Vet newVet);

    Set<Vet> findAll();
}
