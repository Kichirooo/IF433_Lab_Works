package oop_00000110585_AndrewReynardHamdani.week10

class WalletRepository<T : Any> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }

    fun findByName(name: String): T? {
        return items.find {
            when (it) {
                is Coin -> it.name == name
                else -> false
            }
        }
    }
}