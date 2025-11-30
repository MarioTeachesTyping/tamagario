package com.example.tamagario;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface PetDao
{
    @Insert
    long insertPet(Pet pet);

    @Update
    void updatePet(Pet pet);

    @Delete
    void deletePet(Pet pet);

    @Query("SELECT * FROM Pet WHERE id = :id LIMIT 1")
    Pet getPetById(long id);

    @Query("SELECT * FROM Pet LIMIT 1")
    Pet getSinglePet();

    @Query("SELECT * FROM Pet")
    List<Pet> getAllPets();
}