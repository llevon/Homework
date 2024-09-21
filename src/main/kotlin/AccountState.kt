sealed class AccountState {
    data object Active : AccountState()
    data object Inactive : AccountState()
    data class Suspended(val reason: String) : AccountState()
}