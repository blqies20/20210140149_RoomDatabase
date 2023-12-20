package com.example.activity7_roomsiswa.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

/*
kalau ada database lagi, berarti entities ditambah (entities = [Siswa::class,Mapel::class]), abstract fun nya juga tambah sesuai dengan entities
 */
@Database(entities = [Siswa::class], version = 1, exportSchema = false)
abstract class DatabaseSiswa : RoomDatabase() {
    abstract fun siswaDao() : SiswaDao


    /**
     * memang codingannya begini, yg perhatikan pada roomdatabse nya
     */
    companion object{
        @Volatile
        private var Instance: DatabaseSiswa? = null

        fun getDatabase(context: Context): DatabaseSiswa {
            return (Instance?: synchronized(this){
                Room.databaseBuilder(context, DatabaseSiswa::class.java,"siswa_database").build().also { Instance=it }
            })
        }
    }
}