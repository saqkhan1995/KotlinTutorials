package `10Inheritance`

class VampyreKing(name: String): Vampyre(name) {
    init {                  // Overrides the parent class property when an object gets created i.e. during instantiation
        hitPoints = 140
    }

    override fun takeDamage(damage: Int) {
        super.takeDamage(damage / 2)
    }
}