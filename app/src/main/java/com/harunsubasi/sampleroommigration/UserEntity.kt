package com.harunsubasi.sampleroommigration

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class UserEntity(

    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val name: String,
    val surname: String,
    @ColumnInfo(defaultValue = "25")
    val schoolNumber: Int
)