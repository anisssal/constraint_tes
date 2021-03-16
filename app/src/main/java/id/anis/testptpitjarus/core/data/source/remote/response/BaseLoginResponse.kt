import com.google.gson.annotations.SerializedName

data class BaseLoginResponse (

	@SerializedName("stores") val stores : List<StoresResponse>,
	@SerializedName("status") val status : String,
	@SerializedName("message") val message : String
)