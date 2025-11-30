package com.example.tamagario;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(
        entities = {Pet.class, Interaction.class},
        version = 1,
        exportSchema = false
)
public abstract class AppDatabase extends RoomDatabase
{
    public abstract PetDao petDao();

    public abstract InteractionDao interactionDao();
}

