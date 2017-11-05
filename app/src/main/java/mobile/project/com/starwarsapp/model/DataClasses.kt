package mobile.project.com.starwarsapp.model

/**
 * Created by andressa on 05/11/17.
 */

data class Movie(val title : String, val episodeId : Int, val characters : List<Character>)

data class Character(val name : String, val gender : String) {

    override fun toString(): String {
        return "${name} - ${gender}"
    }

}