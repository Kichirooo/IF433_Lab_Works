package oop_00000110585_AndrewReynardHamdani.week14

class UserValidatior {
    fun validate(user: User): Boolean = user.email.contains("@") && user.age >= 18
}

class UserRepository {
    fun save(user: User) {
        println("Saving user: ${user.name} to Database")
    }
}