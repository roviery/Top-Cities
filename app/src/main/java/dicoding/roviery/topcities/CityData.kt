package dicoding.roviery.topcities

object CityData {
    private val cityNames = arrayOf("London, England",
    "New York City, United States",
    "Paris, France",
    "Moscow, Russia",
    "Tokyo, Japan",
    "Dubai, United Arab Emirates",
    "Singapore",
    "Barcelona, Spain",
    "Los Angeles, United States",
    "Madrid, Spain")


    private val cityPhotos = arrayOf(R.drawable.london,
        R.drawable.new_york,
        R.drawable.paris,
        R.drawable.moscow,
        R.drawable.tokyo,
        R.drawable.dubai,
        R.drawable.singapore,
        R.drawable.barcelona,
        R.drawable.los_angeles,
        R.drawable.madrid)

    private val cityDetails = arrayOf("London adalah ibu kota Inggris dan Britania Raya, merupakan wilayah metropolitan terbesar di Britania Raya. Berlokasi di sepanjang Sungai Thames, London telah menjadi permukiman utama selama dua milenium sejak didirikan oleh Romawi pada abad ke-1 dengan nama Londinium.",
    "Kota New York adalah kota terpadat di Amerika Serikat, dan pusat wilayah metropolitan New York yang merupakan salah satu wilayah metropolitan terpadat di dunia. Sebuah kota global terdepan, New York memberi pengaruh besar terhadap perdagangan, keuangan, media, budaya, seni, mode, riset, penelitian dan hiburan dunia.",
    "Paris adalah ibu kota Prancis. Terletak di sungai Seine, di utara Prancis, di jantung region Île-de-France. Kota Paris pada batas administratifnya memiliki penduduk 2.167.994 jiwa. Unité urbaine Paris memanjang ke luar batas kota administratif dan memiliki perkiraan penduduk 9.93 juta.",
    "Moskwa atau Moskow adalah ibu kota Rusia sekaligus pusat politik, ekonomi, budaya, dan sains utama di negara tersebut. Moskwa adalah kota berpenduduk terbanyak di Rusia dan Eropa serta menjadi kawasan urban terbesar ke-6 di dunia. Berdasarkan sensus tahun 2010, Moskwa memiliki penduduk sebesar 11,5 juta jiwa.",
    "Tokyo, nama resminya Metropolis Tokyo, adalah salah satu dari 47 prefektur Jepang yang menjadi ibu kota Jepang sejak 1869. Per 2018, Tokyo Raya menempati peringkat pertama sebagai wilayah metropolitan terpadat di dunia. Tokyo menjadi tempat bertahtanya Kaisar Jepang, pemerintah Jepang, dan Parlemen Jepang.",
    "Dubai adalah satu dari tujuh emirat dan kota terpadat di Uni Emirat Arab. Terletak di sepanjang pantai selatan Teluk Persia di Jazirah Arab. Kotamadya Dubai kadang-kadang disebut Kota Dubai untuk membedakannya dari emirat. Dokumen tertulis menyatakan keberadaan kota ini selama 150 tahun sebelum pembentukan UEA.",
    "Singapura adalah sebuah negara pulau di lepas ujung selatan Semenanjung Malaya, 137 kilometer di utara khatulistiwa di Asia Tenggara. Negara ini terpisah dari Malaysia oleh Selat Johor di utara, dan dari Kepulauan Riau, Indonesia oleh Selat Singapura di selatan.",
    "Barcelona adalah sebuah kota terbesar kedua di Spanyol dan merupakan ibu kota wilayah otonom Katalonia. Jumlah penduduknya di wilayah pusat kota adalah 1,6 juta jiwa. Bersama dengan wilayah di sekitar sisi kota, penduduknya berjumlah 4,5 juta jiwa. Penduduk di wilayah metropolitan adalah sekitar 5 juta jiwa.",
    "Los Angeles dengan jumlah penduduk sebanyak 3.792.621 jiwa sesuai Sensus Amerika Serikat 2010, adalah kota terpadat di negara bagian California, dan kota terpadat kedua di Amerika Serikat, setelah New York City. Luasnya mencapai 468,67 mil persegi, dan terletak di California Selatan.",
    "Madrid adalah ibu kota dan kota terbesar di Spanyol. Kota ini terletak di Sungai Manzanares di bagian tengah negara Spanyol. Jumlah penduduk kota seluas 607 km² ini adalah 3,228 juta jiwa, sedangkan bila daerah metropolitannya dihitung dapat mencapai 5,843 juta jiwa.")

    private val cityHighlightedRankings = arrayOf("Programming, Promotion",
    "Programming, Promotion",
    "Product, Promotion",
    "Place, Product",
    "Place, Prosperity",
    "Place, People",
    "People, Promotion",
    "Place, Promotion",
    "Product, Promotion",
    "Place, Programming")


    val listData: ArrayList<City>
        get(){
            val list = arrayListOf<City>()
            for (i in cityNames.indices){
                val city = City()
                city.name = cityNames[i]
                city.detail = cityDetails[i]
                city.highlightedRankings = cityHighlightedRankings[i]
                city.photo = cityPhotos[i]
                list.add(city)
            }
            return list
        }
}