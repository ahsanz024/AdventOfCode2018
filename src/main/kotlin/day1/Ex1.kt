package day1

import Utils
import io.reactivex.rxkotlin.subscribeBy
import io.reactivex.rxkotlin.toObservable

fun main(args : Array<String>) {
    Ex1()
}

class Ex1 {
    init {
        val fr = Utils.readFile("./src/main/kotlin/day1/ex1")

        fr.readLines().toObservable()
                .filter { it.isNotEmpty() }
                .map { it.toInt() }
                .reduce(0) { sum, element -> sum + element }
                .subscribeBy (
                        onError = { println("Error $it")},
                        onSuccess = { print("Result Ex1 -> $it")}
                )
                .dispose()

    }
}