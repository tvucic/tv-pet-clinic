package com.tomo.tvpetclinic.services;

import com.tomo.tvpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>
{
    Owner findByLastName(String lastName);
}
