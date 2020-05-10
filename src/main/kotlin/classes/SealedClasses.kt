package classes

sealed class PageResult {
    class Success(val content: String) : PageResult()
    class Error(val erroCode: Int, val message: String) : PageResult()
}

fun getURLPage(url: String): PageResult {
    val wasValidCall = false
    if (wasValidCall) {
        return PageResult.Success("The content")
    } else {
        return PageResult.Error(404, "Not Found")
    }
}

fun main() {
    val pageResult = getURLPage("/")

    when (pageResult) {
        is PageResult.Success -> println(pageResult.content)
        is PageResult.Error -> println(pageResult.message)
    }
}