package testArrow

import arrow.higherkind

@higherkind
class Id<out A>(val value: A)

val x: IdOf<Int> = Id(42)