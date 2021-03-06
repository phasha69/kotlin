import kotlin.random.Random

class Dog: Animal() {

    override val type = "Dog - "
    override var energy = Random.nextInt(6, 10)
        get() = if (field < 0) 0 else field
    override var weight = Random.nextInt(3, 7)
        get() = if (field < 0) 0 else field
    override val maxAge = 7
    override val name = type + getRandomName()

    init {
        println("Появилась собака $name")
    }

    override fun eat() {
        if (viability()) super.eat().run { println("Собака ($name) ест") }
    }

    override fun move() {
        if (viability()) super.move().run { println("Собака ($name) летит") }
    }

    override fun sleep() {
        if (viability()) super.sleep().run { println("Собака ($name) спит") }
    }

    override fun birthAnimal(): Dog {
        println("Собака (${name}) дала потомство! ")
        val animal = Dog()
        bithing++
        println("""новое потомство:
        |имя: ${animal.name}
        |энергия: ${animal.energy}
        |вес: ${animal.weight}
    """.trimMargin())
        return animal
    }
}