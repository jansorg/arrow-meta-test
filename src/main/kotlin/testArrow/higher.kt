package testArrow

import arrow.higherkind

@higherkind
class Id<out A>(val value: A)

val x: IdOf<Int> = Id(42)

fun main() {
    val x :IdOf<Int> = Id(12).fix()
    val y :IdOf<String> = Id("hello").fix()
    val z : IdOf<Float> = Id(123f).fix()
    val w : IdOf<Int> = Id(123).fix()
}