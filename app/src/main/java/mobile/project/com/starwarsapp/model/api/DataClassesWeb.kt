package mobile.project.com.starwarsapp.model.api

import com.google.gson.annotations.SerializedName

/**
 * Created by andressa on 05/11/17.
 */

data class FilmResult(val results : List<Film>)

data class Film (val title : String,
                 @SerializedName("episode_id")
                 val episodeId : Int,
                 @SerializedName("characters")
                 val personUrls : List<String>)

data class Person(val id : String, val gender : String)