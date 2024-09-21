fun main() {

    val users = mutableListOf(
        User("Levon", 23, 2200.0, AccountState.Active),
        User("Leon", 33, 10000.0, AccountState.Active),
        User("Narek", 26, 20000.0, AccountState.Suspended("Violation of community guidelines")),
        User("Lilith", 24, 3000.0, AccountState.Inactive),
        User("Nelly", 27, 800.0, AccountState.Active),
        User("Aram", 35, 200.0, AccountState.Inactive),
        User("Armen", 16, 7000.0, AccountState.Suspended("Spam activity")),
        User("Vardan", 10, 2000.0, AccountState.Suspended("Is a minor")),
        User("Max", 19, 7700.0, AccountState.Active),
        User("Alex", 20, 9800.0, AccountState.Active)
    )

    println("List of all users")
    for (user in users) {
        println(user)
    }

    /* //nicer look
   for (user in users) {
        print("User: ${user.name}, Age: ${user.age}, Balance: ${user.balance},")
        when (user.accountState) {
            is AccountState.Active -> println(" State: Active")
            is AccountState.Inactive -> println(" State: Inactive")
            is AccountState.Suspended -> {
                val reason = (user.accountState as AccountState.Suspended).reason
                println(" State: Suspended, Reason: $reason")
            }
        }
    }*/

    println()

    println("List of Active users with 1000+ account balance")
    for (user in users) {
        if (user.checkBalance() && user.accountState == AccountState.Active) {
            println(user)
            //println("User: ${user.name}, Age: ${user.age}, Balance: ${user.balance}, State: ${user.accountState}")
        }
    }
}