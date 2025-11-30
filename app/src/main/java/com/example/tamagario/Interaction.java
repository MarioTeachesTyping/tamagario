package com.example.tamagario;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(
        foreignKeys = @ForeignKey(
                entity = Pet.class,
                parentColumns = "id",
                childColumns = "petId",
                onDelete = ForeignKey.CASCADE
        ),
        indices = {@Index("petId")}
)
public class Interaction
{
    @PrimaryKey(autoGenerate = true)
    public long id;

    public long petId;     // FK to Pet.id

    public String type;    // "FEED", "PLAY", "REST", "CLEAN"
    public long timestamp; // System.currentTimeMillis(), etc.
}

