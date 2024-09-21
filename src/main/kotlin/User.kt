data class User(
    val name: String,
    val age: Int,
    var balance: Double = 0.0,
    var accountState: AccountState
)