package id.anis.testptpitjarus.core.data.source.local.room

import androidx.lifecycle.LiveData
import androidx.room.*
import id.anis.testptpitjarus.core.data.source.local.entity.StoresEntity

@Dao
interface StoreDao {


    @Query("SELECT * FROM storeTable")
    fun getMovies(): LiveData<List<StoresEntity>>



}