package com.tomo.tvpetclinic.services;

import com.tomo.tvpetclinic.model.Pet;

import java.util.Set;

public interface PetService
{
    Pet findByLastName(String lastName);

    Pet findById(Long id);

    Pet save(Pet newPet);

    Set<Pet> findAll();
}
