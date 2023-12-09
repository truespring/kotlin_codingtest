package com.rubok.codingtest.programmers.basic.day05

import org.junit.jupiter.api.Test

class ControlNumber2 {

    fun solution(numLog: IntArray): String {
        return List(numLog.dropLast(1).size) { index ->
            numLog[index + 1] - numLog[index]
        }.joinToString("")
        {
            when (it) {
                1 -> "w"
                -1 -> "s"
                10 -> "d"
                -10 -> "a"
                else -> ""
            }
        }
    }

    @Test
    fun test() {
        val numLog = intArrayOf(0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1)
        println(solution(numLog))
    }
}