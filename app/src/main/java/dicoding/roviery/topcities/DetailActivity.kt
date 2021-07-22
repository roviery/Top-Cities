package dicoding.roviery.topcities

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class DetailActivity : AppCompatActivity() {

    companion object{
        const val CITY_NAME = "city_name"
        const val CITY_DETAIL = "city_detail"
        const val CITY_HR = "city_hr"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_back_button)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val name = intent.getStringExtra(CITY_NAME)
        val detail = intent.getStringExtra(CITY_DETAIL)
        val hr = intent.getStringExtra(CITY_HR)
        val photo = intent.getIntExtra("CITY_PHOTO", 0)

        val cityName: TextView = findViewById(R.id.name_detail)
        val cityDetail: TextView = findViewById(R.id.detail_detail)
        val cityHR: TextView = findViewById(R.id.hr_detail)
        val cityPhoto: ImageView = findViewById(R.id.photo_detail)

        setActionBarTitle(name.toString())
        cityName.text = name
        cityDetail.text = detail
        cityHR.text = hr
        Glide.with(this)
            .asBitmap()
            .load(photo)
            .into(cityPhoto)
    }

    fun setActionBarTitle(title: String){
        supportActionBar?.title = title
    }
}