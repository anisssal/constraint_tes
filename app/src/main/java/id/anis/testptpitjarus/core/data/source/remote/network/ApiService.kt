package id.anis.bajpsub1.data.source.remote

import retrofit2.Call
import retrofit2.http.*

interface ApiService {




    @FormUrlEncoded
    @POST("api/sariroti_md/index.php/login/loginTest")
    fun postLogin(@Field("username") username : String , @Field("password" )password : String)
}