class Player3(val name:String, var level: Int = 1, var lives: Int = 3, var score: Int =0) {
    var weapon: Weapon = Weapon("Fist", 1)

    fun show(){
        println("""
            name : $name
            lives : $lives
            level : $level
            score : $score
                """)
    }

    fun show2(){
        println("""
            name : $name
            lives : $lives
            level : $level
            score : $score
            weaponName: ${weapon.name}
            weaponDamage: ${weapon.damageInflicted}
                """)
    }
}

class Weapon(val name: String, var damageInflicted: Int){

}