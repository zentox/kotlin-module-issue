package example

interface Identity {
    fun <T> identity(t:T): T
}