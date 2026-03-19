package dadb

class User(val name: String?, val age: Int)

fun main() {
    val user = User(null, -1)

    // ❌ 1. 空指针风险（强制 !!）
    println(user.name!!.length)

    // ❌ 2. 逻辑错误
    if (user.age > 0) {

        println("User is minor")
    }

    // ❌ 3. 除以 0
    val result = 10 / 0
    println(result)

    // ❌ 4. 死循环
    var i = 0
    while (i < 10) {
        println(i)
    }

    // ❌ 5. 不安全类型转换
    val obj: Any = "hello"
    val num = obj as Int
    println(num)

    // ❌ 6. 未处理异常
    val list = listOf(1, 2, 3)
    println(list[10])
}