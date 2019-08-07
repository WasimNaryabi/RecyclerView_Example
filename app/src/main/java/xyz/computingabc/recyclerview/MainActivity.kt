package xyz.computingabc.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val movies = listOf(
            Movie(1,"",true,"UA",73,2415,"Captain Marvel","English","3D"),
            Movie(2,"",true,"UA",173,2415,"Captain Marvel","English","3D"),
            Movie(3,"",true,"UA",73,2415,"Captain Marvel","English","3D"),
            Movie(4,"",false,"UA",273,2415,"Captain Marvel","English","3D"),
            Movie(5,"",true,"UA",734,2415,"Captain Marvel","English","3D"),
            Movie(6,"",false,"UA",713,2415,"Captain Marvel","English","3D"),
            Movie(7,"",true,"UA",273,2415,"Captain Marvel","English","3D"),
            Movie(8,"",true,"UA",973,2415,"Captain Marvel","English","3D"),
            Movie(9,"",false,"UA",373,2415,"Captain Marvel","English","3D"),
            Movie(10,"",true,"UA",723,2415,"Captain Marvel","English","3D")

        )

        recyclerViewMovies.layoutManager= LinearLayoutManager(this)
        recyclerViewMovies.adapter=MoviesAdopte(movies)
    }
}
