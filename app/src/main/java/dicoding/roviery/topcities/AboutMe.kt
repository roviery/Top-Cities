package dicoding.roviery.topcities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class AboutMe : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_me)
        setActionBarTitle("About Me")

        supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_back_button)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }

    private fun setActionBarTitle(title: String){
        supportActionBar?.title = title
    }
}