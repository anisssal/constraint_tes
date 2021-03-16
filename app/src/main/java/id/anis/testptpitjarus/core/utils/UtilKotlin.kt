//
//import android.app.Activity
//import android.content.Context
//import android.content.DialogInterface
//import android.content.res.Resources
//import android.util.Log
//import android.util.TypedValue
//import android.view.View
//import android.view.WindowManager
//import android.view.inputmethod.InputMethodManager
//import androidx.appcompat.app.AlertDialog
//import androidx.core.content.ContextCompat
//import java.sql.Date
//import java.text.SimpleDateFormat
//import java.util.*
//
//
//object UtilKotlin {
//    fun handleError(errorCode: Int) {
//        when (errorCode) {
//            404 -> {
//                Log.d(TAGERRORCODE, "Not Found")
//            }
//            500 -> {
//                Log.d(TAGERRORCODE, "Server Broken")
//            }
//
//            else -> {
//                Log.d(TAGERRORCODE, "Unknown error ")
//            }
//        }
//    }
//
//    fun getToastLoading(context: Context) =
//        Toasty.custom(context, "Mohon tungu sejenak.." , null , ContextCompat.getColor(context , R.color.white_to_grey2), ContextCompat.getColor(context , R.color.black),
//            Toasty.LENGTH_SHORT, false ,true )
//
//
//
//    fun hanldeErrorWithEvent(errorCode: Int) : Event<String> {
//        when (errorCode) {
//            404 -> {
//                return Event("Not Found")
//            }
//            500 -> {
//                return Event("Terjadi kesalahan, server sedang dalam perbaikan, mohon tunggu beberapa saat lagi")
//            }
//            204->{
//                return Event("Server tidak merespon, ulangi beberapa saat lagi!")
//            }
//
//            else -> {
//               return Event("Unknown error, try again or contact administrator")
//            }
//        }
//    }
//
//    fun showDialog(
//        context: Context,
//        title: String? = null,
//        message: String? = null,
//        positiveText: String? = null,
//        positiveListener : DialogInterface.OnClickListener? =null,
//        negativeText: String? = null,
//        negativeListener : DialogInterface.OnClickListener? =null,
//        neutralText: String? = null,
//        neutralListener : DialogInterface.OnClickListener? =null
//    ) {
//        AlertDialog.Builder(context).apply {
//            title?.let {
//                this.setTitle(title)
//            }
//            message?.let {
//                this.setMessage(message)
//            }
//            positiveText?.let {
//                this.setPositiveButton(positiveText , positiveListener)
//            }
//            negativeText?.let {
//                this.setNegativeButton(negativeText, negativeListener)
//            }
//            neutralText?.let {
//                this.setNeutralButton(neutralText, neutralListener)
//            }
//            this.show()
//        }
//
//
//    }
//
//    fun showCheckConMessage(context: Context, okText : String? = null ,  oklistener : DialogInterface.OnClickListener? = null) {
//        AlertDialog.Builder(context)
//            .setMessage("Gagal mendapatkan data, coba lagi! ")
//            .setPositiveButton(okText, oklistener)
//            .show()
//    }
//    fun showDialogWithColor(context: Context , title: String? , message: String? ,
//                   positiveText: String? , negativeText: String? , colorPositive: Int , colorNegative: Int , positiveAction:(dialog :DialogInterface  , which : Int) ->Unit ) {
//        val dialog = AlertDialog.Builder(context)
//            .setTitle(title)
//            .setMessage(message)
//            .setPositiveButton(positiveText) { dialog, which->
//                positiveAction(dialog , which)
//            }
//            .setNegativeButton(negativeText, null)
//            .create()
//        dialog.setOnShowListener {
//            dialog.getButton(AlertDialog.BUTTON_POSITIVE)
//                .setTextColor(ContextCompat.getColor(context, colorPositive))
//            dialog.getButton(AlertDialog.BUTTON_NEGATIVE)
//                .setTextColor(ContextCompat.getColor(context, colorNegative))
//        }
//        dialog.show()
//    }
//
//    fun upperCaseFirst(str : String) :String {
//        return "${str.substring(0, 1).toUpperCase(Locale.ROOT)}${str.substring(1)}"
//    }
//
//    fun disableUserInteraction(act: Activity) {
//        act.getWindow().setFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE,
//            WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE)
//    }
//
//    fun enableUserInteraction(act: Activity) {
//        act.getWindow().clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE)
//    }
//
//     fun dpToPx(context: Context, dp: Int): Int {
//        val r: Resources = context.getResources()
//        return Math.round(
//            TypedValue.applyDimension(
//                TypedValue.COMPLEX_UNIT_DIP,
//                dp.toFloat(),
//                r.getDisplayMetrics()
//            )
//        )
//    }
//
//    fun convertDateHumanReadable(dateString :  String) : String {
//        val dateFormat = SimpleDateFormat("yyyy-MM-dd")
//        val dateAwal = Date(dateFormat.parse(dateString).time)
//        val simpleDateFormat = SimpleDateFormat( "dd MMMM yyyy", Locale("ind", "IDN"))
//        val tz = TimeZone.getDefault()
//        simpleDateFormat.setTimeZone(tz)
//        return  simpleDateFormat.format(dateAwal)
//    }
//
//    fun hideKeyboard(activity: Activity) {
//        val imm: InputMethodManager =
//            activity.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
//        //Find the currently focused view, so we can grab the correct window token from it.
//        var view: View? = activity.currentFocus
//        //If no view currently has focus, create a new one, just so we can grab a window token from it
//        if (view == null) {
//            view = View(activity)
//        }
//        imm.hideSoftInputFromWindow(view.getWindowToken(), 0)
//    }
//
//    @JvmStatic
//    val EMAIL_REGEX = "^[A-Za-z](.*)([@]{1})(.{1,})(\\.)(.{1,})";
//    fun isEmailValid(email: String): Boolean {
//        return EMAIL_REGEX.toRegex().matches(email);
//    }
//    val TAGERRORCODE = "kode error"
//
//}