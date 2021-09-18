import example.Identity

class MyIdentity : Identity {
    override fun <T> identity(t: T): T {
        return t
    }
}