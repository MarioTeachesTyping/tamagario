package com.example.tamagario;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Pet
{
    @PrimaryKey(autoGenerate = true)
    public long id;

    public String name;

    public int hunger;
    public int energy;
    public int happiness;
    public int hygiene;
}
