package learnkotlin

fun main() {
     val name = "Talha(Valuable Degisken)"
     // val değişkenleri değiştirilemez
     //name = "Talha Saglam" // Yaptıgımızda yeniden adlandırılamaz hatası alırız
    println(name)

    var sayi:Int? = null // nullable bir tanımlama
    var name2:String = "Talha Saglam" // isim atandı
    var yasi:Byte? = 22 // nullable olabilcek bir değişkene atama yapıldı
    var okuyorMu:Boolean = true
    var basHarf:Char = 'T'

    println("İsim:"+name2+"(VariAble)")
    println("İsminin Baş Harfi:"+basHarf)
    println("Okuyor mu:"+okuyorMu)
    println("Yaş:"+yasi)
    println() //Satır atlama işlemi için yapıldı
    println()



    // Bir değişkeni string içerisinde kullanıcaksak $(dolar) işareti kullanılır

    print("Merhaba ben $name2 , $yasi yaşındayım")



}