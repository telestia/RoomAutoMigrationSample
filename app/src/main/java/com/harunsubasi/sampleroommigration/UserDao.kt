package com.harunsubasi.sampleroommigration

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface UserDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveUser(userEntity: UserEntity): Long


    @Query("SELECT * FROM userEntity")
    suspend fun getAll(): List<UserEntity>

}