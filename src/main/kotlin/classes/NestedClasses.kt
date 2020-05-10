package classes

class DirectoryExplorer(val user: String) {

    inner class PermissionCheck {
        fun validatePermission() {
            if (user != "Mario") {

            }
        }
    }

    fun listFolder(folder: String, user: String) {
        val permissionCheck = PermissionCheck()
        permissionCheck.validatePermission()
    }
}

fun main() {
    val dir = DirectoryExplorer("Mario")
    val permission = DirectoryExplorer("Mario").PermissionCheck()

}