package dicoding.roviery.topcities

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class CityAdapter(private val listCity: ArrayList<City>): RecyclerView.Adapter<CityAdapter.CardViewViewHolder>(){
    class CardViewViewHolder (itemView: View): RecyclerView.ViewHolder(itemView){
        var cityPhoto: ImageView = itemView.findViewById(R.id.city_photo)
        var cityName: TextView = itemView.findViewById(R.id.city_name)
        var cityDetail: TextView = itemView.findViewById(R.id.city_detail)
        var detailBtn: Button = itemView.findViewById(R.id.detail_btn)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_cities, parent, false)
        return CardViewViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int) {
        val city = listCity[position]
        Glide.with(holder.itemView.context)
            .load(city.photo)
            .apply(RequestOptions().override(150,220))
            .into(holder.cityPhoto)
        holder.cityName.text = city.name
        holder.cityDetail.text = city.detail
        holder.detailBtn.setOnClickListener {
            val intent = Intent(holder.itemView.context, DetailActivity::class.java)
            intent.putExtra(DetailActivity.CITY_NAME, city.name)
            intent.putExtra(DetailActivity.CITY_DETAIL, city.detail)
            intent.putExtra(DetailActivity.CITY_HR, city.highlightedRankings)
            intent.putExtra("CITY_PHOTO", city.photo)
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return listCity.size
    }


}