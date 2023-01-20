package com.harunsubasi.sampleroommigration

import androidx.room.AutoMigration
import androidx.room.Database
import androidx.room.RenameColumn
import androidx.room.RoomDatabase
import androidx.room.migration.AutoMigrationSpec

@Database(
    version = 3,
    entities = [UserEntity::class],
    exportSchema = true,
    autoMigrations = [
        AutoMigration(from = 1, to = 2),
        AutoMigration(from = 2, to = 3, spec = AppDatabase.Migrate2To3::class)
    ]
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao

    @RenameColumn(tableName = "UserEntity", fromColumnName = "number", toColumnName = "schoolNumber")
    class Migrate2To3 : AutoMigrationSpec
}
