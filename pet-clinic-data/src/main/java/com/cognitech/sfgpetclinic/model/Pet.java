/*
 * Created by User on 02/02/2019
 */

package com.cognitech.sfgpetclinic.model;

import java.time.LocalDate;

/**
 * Class used for Pet
 */
public class Pet
{
    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;

    public PetType getPetType()
    {
        return petType;
    }

    public void setPetType(PetType petType)
    {
        this.petType = petType;
    }

    public Owner getOwner()
    {
        return owner;
    }

    public void setOwner(Owner owner)
    {
        this.owner = owner;
    }

    public LocalDate getBirthDate()
    {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate)
    {
        this.birthDate = birthDate;
    }
}