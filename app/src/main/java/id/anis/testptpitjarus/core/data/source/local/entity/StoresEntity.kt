package id.anis.testptpitjarus.core.data.source.local.entity

import android.os.Parcelable
import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Entity(tableName = "storeTable")
@Parcelize
data class StoresEntity (

	@PrimaryKey
	@NonNull
	 val store_id : Int,
	 val store_code : String,
	 val store_name : String,
	 val address : String,
	 val dc_id : Int,
	 val dc_name : String,
	 val account_id : Int,
	 val account_name : String,
	 val subchannel_id : Int,
	 val subchannel_name : String,
	 val channel_id : Int,
	 val channel_name : String,
	 val area_id : Int,
	 val area_name : String,
	 val region_id : Int,
	 val region_name : String,
	 val latitude : Double,
	 val longitude : Double
) : Parcelable