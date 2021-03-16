package id.anis.testptpitjarus.core.data.source.local.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import id.anis.testptpitjarus.core.data.source.local.entity.StoresEntity


@Database(
    entities = [StoresEntity::class],
    version = 1,
    exportSchema = false
)
abstract class PitjarusDatabase : RoomDatabase() {
    abstract fun storeDao(): StoreDao

    companion object {

        @Volatile
        private var INSTANCE: PitjarusDatabase? = null

        fun getInstance(context: Context): PitjarusDatabase =
            INSTANCE ?: synchronized(this) {
                INSTANCE ?: Room.databaseBuilder(
                    context.applicationContext,
                    PitjarusDatabase::class.java,
                    "pitjarus_data.db"
                ).build()
            }
    }
}