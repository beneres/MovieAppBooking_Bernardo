package com.bernardo.movieappbooking_bernardo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList : ArrayList<Movies>
    lateinit var imageId : Array<Int>
    lateinit var heading : Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageId = arrayOf(
            R.drawable.movie1,
            R.drawable.movie2,
            R.drawable.movie3,
            R.drawable.movie4,
            R.drawable.movie5,

        )
        heading = arrayOf(
           " From Warner Bros. Pictures comes \"The Batman,\" with director Matt Reeves (the \"Planet of the Apes\" films) at the helm and with Robert Pattinson (\"Tenet,\" \"The Lighthouse,\" \"Good Time\") starring as Gotham City's vigilante detective, Batman.",
           "The world’s favourite blue hedgehog is back for a next-level adventure in SONIC THE HEDGEHOG 2. After settling in Green Hills, Sonic is eager to prove he has what it takes to be a true hero. His test comes when Dr. Robotnik returns, this time with a   ",
           "In “Death on the Nile,” Hercule Poirot’s Egyptian adventure aboard a glamorous river steamer descends into a terrifying search for a murderer ",
            "A budding director tries to research a merciless gangster for making a film on gangster-ism. But her secret attempts to make the biopic fail when she gets caught. ",
            "Acclaimed filmmaker Joachim Trier (Oslo, August 31st, Louder Than Bombs) returns with THE WORST PERSON IN THE WORLD, a wistful and subversive romantic drama about the quest for love and meaning.  ",
        )
        newRecyclerView = findViewById(R.id.recyclerView)
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)

        newArrayList = arrayListOf<Movies>()
        getUserdata()
    }

    private fun getUserdata() {

        for(i in imageId.indices){

            val movies = Movies(imageId[i],heading[i])
            newArrayList.add(movies)
        }

        newRecyclerView.adapter = MyAdapter(newArrayList)
    }
}