sealed class Truck {
    protected abstract val baggage: Baggage<Product>
    abstract val capacity: Int

    data class PassengerCar(override val capacity: Int = 500, override val baggage: Baggage<Product> = Baggage()):
        Truck() {
        init {
            createBaggage(capacity)
        }
    }

    data class GazelleCar(override val capacity: Int = 1000, override val baggage: Baggage<Product> = Baggage()):
        Truck() {
        init {
            createBaggage(capacity)
        }
    }

    data class FreightCar(override val capacity: Int = 2500, override val baggage: Baggage<Product> = Baggage()):
        Truck() {
        init {
            createBaggage(capacity)
        }
    }

    fun printProductList() = baggage.printProductList()
    fun loading(product: Product) = baggage.push(product) //
    fun unLoading() = baggage.pop() //

    companion object {
        fun createBaggage(capacity: Int) {

        }

    }
}
