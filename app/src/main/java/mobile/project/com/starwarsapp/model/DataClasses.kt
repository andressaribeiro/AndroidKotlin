package mobile.project.com.starwarsapp.model

data class Movie(val title : String, val episodeId : Int, val characters : List<Character>)

data class Character(val name : String, val gender : String) {

    override fun toString(): String {
        return "${name} - ${gender}"
    }

}