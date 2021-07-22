package dicoding.roviery.topcities

import android.content.Intent
import android.os.Bundle
import android.text.Html
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvCities: RecyclerView
    private var list: ArrayList<City> = arrayListOf()
    private var title: String = "Main Page"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setActionBarTitle(title)

        rvCities = findViewById(R.id.rv_city)
        rvCities.setHasFixedSize(true)

        list.addAll(CityData.listData)
        showMainPage()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.about_me -> { showAboutMe() }
        }
        return super.onOptionsItemSelected(item)
    }

    private fun showMainPage(){
        rvCities.layoutManager = LinearLayoutManager(this)
        val cityAdapter = CityAdapter(list)
        rvCities.adapter = cityAdapter
    }

    private fun showAboutMe(){
        val intent = Intent(this, AboutMe::class.java)
        startActivity(intent)
    }

    private fun setActionBarTitle(title: String){
        actionBar?.title = Html.fromHtml("<font color=\"white\">" + getString(R.string.app_name) + "</font>")
        supportActionBar?.title = title
    }


}