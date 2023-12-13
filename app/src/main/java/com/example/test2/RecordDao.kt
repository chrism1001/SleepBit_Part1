package com.codepath.articlesearch

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface RecordDao {
    @Query("SELECT * FROM sleep_record")
    fun getAll(): Flow<List<RecordEntity>>

    @Insert
    fun insertRecord(record: RecordEntity)
    @Insert
    fun insertAll(records: List<RecordEntity>)

    @Query("DELETE FROM sleep_record")
    fun deleteALL()
}