fun main(args: Array<String>) {
    /**
     * import도 없고 세미콜론도 없는 코틀린 스타일
     */
    println(Runtime.getRuntime().availableProcessors())

    /**
     * 코틀린은 정적 타입언어
     * 변수의 타입이 컴파일 시점에 정해진다.
     * 타입 추론기능 예제
     */
    val greet = "hello"
    println(greet)
    println(greet::class)
    println(greet.javaClass)

    /**
     * 이뮤터블이 뮤터블보다 좋은 이유
     */
    var factor = 2
    fun doubleIt(n: Int) = n * factor
    factor = 0
    println(doubleIt(2))

    /**
     * 코틀린의 안전한 equals
     */
    println("hi" == "hi")
    println("hi" == "Hi")
    println(null == "hi")
    println("hi" == null)
    println(null == null)

    /**
     * 문자열 템플릿 예제
     */
    val price = 12.25
    val taxRate = 0.08
    val output = "The amount $price after tax comes to $${price * (1 + taxRate)}"
    val disclaimer = "the amount is in US$, that's right in \$only"
    println(output)
    println(disclaimer)
}