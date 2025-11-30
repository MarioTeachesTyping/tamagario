package com.example.tamagario;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface InteractionDao
{
    @Insert
    long insertInteraction(Interaction interaction);

    @Update
    void updateInteraction(Interaction interaction);

    @Delete
    void deleteInteraction(Interaction interaction);

    @Query("SELECT * FROM Interaction WHERE id = :id LIMIT 1")
    Interaction getInteractionById(long id);

    @Query("SELECT * FROM Interaction WHERE petId = :petId ORDER BY timestamp DESC")
    List<Interaction> getInteractionsForPet(long petId);

    @Query("DELETE FROM Interaction WHERE petId = :petId")
    void deleteInteractionsForPet(long petId);
}
