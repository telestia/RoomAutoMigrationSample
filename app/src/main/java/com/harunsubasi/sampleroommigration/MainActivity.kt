package com.harunsubasi.sampleroommigration

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import androidx.room.Room
import androidx.room.RoomDatabase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val database = Room.databaseBuilder(context = this, AppDatabase::class.java, "sample.db")
            .build()
        val dao = database.userDao()
        lifecycleScope.launch(Dispatchers.IO) {
//            val userEntity = UserEntity(name = " Harun", surname = "Subasi")
//            dao.saveUser(userEntity)
            val a = dao.getAll().forEach(::println)
        }

    }
}