
/*
import okhttp3.Call
import okhttp3.Callback
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import java.io.IOException
import org.json.JSONObject


public class coneccion {

    val client = OkHttpClient()
    val site = "https://v6.exchangerate-api.com/v6/fd04b5eaadb8837f4a4f810d/latest"

    val request = Request.Builder()
            .url("$site/USD")
            .build()

        client.newCall(request).enqueue(object : Callback {

        override fun onFailure(call: Call, e: IOException) {
            e.printStackTrace()
        }

        override fun onResponse(call: Call, response: Response) {
            response.use {
                if (!response.isSuccessful) {
                    println("Request failed: ${response.code}")
                    return
                }

                val json = response.body?.string()
                val obj = JSONObject(json!!)
                val rates = obj.getJSONObject("conversion_rates")
                val dop = rates.getDouble("DOP")
                println(dop)
            }
        }
    })


            Thread.sleep(3000)
}
*/