//metadebug

package arrow

@higherkind
class Id2<out A>(val value: A)

@higherkind
class Id3<out A, out B>(val value: A, val value2: B)

val intID =  Id2(1)
val stringID: Id2Of<String> = Id2("foo")

val id3 = Id3("foo bassr", 123)

fun main(args: Array<String>) {
    val x : Kind<String, String>

    println(intID.fix().value)
    println(stringID.fix().value)
    println(id3)
    println(id3.fix())
    println(id3.fix().value2)
}
