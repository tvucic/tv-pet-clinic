package com.tomo.tvpetclinic.services;

import com.tomo.tvpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService
{
    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner newOwner);

    Set<Owner> findAll();
}
