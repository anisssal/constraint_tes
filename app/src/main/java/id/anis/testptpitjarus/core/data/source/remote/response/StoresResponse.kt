import com.google.gson.annotations.SerializedName

data class StoresResponse (

	@SerializedName("store_id") val store_id : Int,
	@SerializedName("store_code") val store_code : String,
	@SerializedName("store_name") val store_name : String,
	@SerializedName("address") val address : String,
	@SerializedName("dc_id") val dc_id : Int,
	@SerializedName("dc_name") val dc_name : String,
	@SerializedName("account_id") val account_id : Int,
	@SerializedName("account_name") val account_name : String,
	@SerializedName("subchannel_id") val subchannel_id : Int,
	@SerializedName("subchannel_name") val subchannel_name : String,
	@SerializedName("channel_id") val channel_id : Int,
	@SerializedName("channel_name") val channel_name : String,
	@SerializedName("area_id") val area_id : Int,
	@SerializedName("area_name") val area_name : String,
	@SerializedName("region_id") val region_id : Int,
	@SerializedName("region_name") val region_name : String,
	@SerializedName("latitude") val latitude : Double,
	@SerializedName("longitude") val longitude : Double
)