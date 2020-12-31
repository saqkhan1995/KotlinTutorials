

class Player(val name: String) {  // No need of explicit constructor like in Java as seen here
    var lives = 3
    var level = 1
    var score = 0

    fun show() {
        println("""
            name : $name
            lives : $lives
            level : $level
            score : $score
            """)
    }

    //no need for explicit setters & getters
}

class Player2(val name: String, val level: Int = 1) { //default value of level is 1 if not passed in instantiation
    var lives = 3
    var score = 0

    fun show() {
        println("""
            name : $name
            lives : $lives
            level : $level
            score : $score
            """)
    }

}

