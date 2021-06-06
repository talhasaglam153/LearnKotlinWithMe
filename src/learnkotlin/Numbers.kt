package learnkotlin

fun main() {
    // Eğer hafızada kullanılan bellek sizin için önemliyse seçeceğiniz değişkenin tipine de dikkat etmelisiniz
    // Örneğin Yaş için byte değişkeni kullanılması daha az yer kullanılmasını sağlar(İnsan yaşının 128 den büyük olmayacağını varsayarsak).

    // max-mix long değerleri
    var maxLong:Long = Long.MAX_VALUE
    var minLong:Long = Long.MIN_VALUE

    println("MaxLong : $maxLong")
    println("MinLong : $minLong")
    println("---------------------------")


    // max-mix integer değerleri
    var maxInt:Int = Int.MAX_VALUE
    var minInt:Int = Int.MIN_VALUE

    println("MaxInt : $maxInt")
    println("MinInt : $minInt")
    println("---------------------------")

    // max-mix short değerleri
    var maxShort:Short = Short.MAX_VALUE
    var minShort:Short =  Short.MIN_VALUE


    var maxuShort:UShort = UShort.MAX_VALUE
    var minuShort:UShort =  UShort.MIN_VALUE
    println("MaxShort: $maxShort")
    println("MinShort: $minShort")
    println("MaxShort: $maxuShort")
    println("MinShort: $minuShort")
    println("---------------------------")
    println("---------------------------")


    // max-mix byte değerleri
    var minByte:Byte = Byte.MIN_VALUE
    var maxByte:Byte = Byte.MAX_VALUE
    println("maxByte: $maxByte")
    println("minByte: $minByte")
    println("---------------------------")


}