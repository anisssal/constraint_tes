package id.bisa.blc.util

import android.content.Context
import android.content.SharedPreferences
import com.securepreferences.SecurePreferences


object SecurePref {

    val IS_LOGGED_IN = "is_user_loged_in"
    val USER_EMAIL = "user_email"
    val USER_NAME = "user_name"
    val USER_CURRENT_LAT = "lat"
    val USER_CURRENT_LNG = "lng"



    private lateinit var context: Context

    @Volatile lateinit var INSTANCE : SharedPreferences

    fun init(context: Context){
        this.context = context
        INSTANCE= synchronized(this){
            SecurePreferences(SecurePref.context, "passwordrahasiasaya", "bisa_pref.xml");
        }
    }

    fun setNumberState(mKey: String, state: Int): Boolean {
        val sharedPref = INSTANCE
        val editor = sharedPref.edit()
        editor.putInt(mKey, state)
        editor.apply()
        return true
    }

    fun getNumberState(mKey: String, defValue: Int): Int {
        var state: Int

        val sharedPref = INSTANCE
        state = sharedPref.getInt(mKey, defValue)

        return state
    }

    fun setNumberState(mKey: String, state: Long): Boolean {
        val sharedPref = INSTANCE
        val editor = sharedPref.edit()
        editor.putLong(mKey, state)
        editor.apply()
        return true
    }

    fun getNumberState(mKey: String, defValue: Long): Long {
        var state: Long

        val sharedPref = INSTANCE
        state = sharedPref.getLong(mKey, defValue)

        return state
    }

    fun setStringState(mKey: String, state: String): Boolean {
        val sharedPref = INSTANCE
        val editor = sharedPref.edit()
        editor.putString(mKey, state)
        editor.apply()
        return true
    }

    fun getStringState(mKey: String, defValue: String): String {
        var state: String? = ""

        val sharedPref = INSTANCE
        state = sharedPref.getString(mKey, defValue)

        return state!!
    }

    fun setBooleanState(mKey: String, state: Boolean): Boolean {
        val sharedPref = INSTANCE
        val editor = sharedPref.edit()
        editor.putBoolean(mKey, state)
        editor.apply()
        return true
    }

    fun getBooleanState(mKey: String, defValue: Boolean): Boolean {
        val state: Boolean

        val sharedPref = INSTANCE
        state = sharedPref.getBoolean(mKey, defValue)

        return state
    }

    fun setLoginSession(role : String , token :String) {
        setBooleanState(IS_LOGGED_IN , true)
    }
    
    fun setUsernameData(username : String){
        setStringState(USER_NAME , username)
    }

    fun setLogoutSession() {
        setBooleanState(IS_LOGGED_IN , false)
        setStringState(USER_NAME , "")
    }

}



