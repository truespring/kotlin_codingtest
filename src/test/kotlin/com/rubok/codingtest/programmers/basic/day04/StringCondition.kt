package com.rubok.codingtest.programmers.basic.day04

import org.junit.jupiter.api.Test

class StringCondition {

    @Test
    fun test() {
        println(solution("<", "=", 20, 50))
        println(solution(">", "!", 41, 78))
    }

    fun solution(ineq: String, eq: String, n: Int, m: Int): Int {
        return when (ineq + eq) {
            ">=" -> 1.takeIf { n >= m } ?: 0
            "<=" -> 1.takeIf { n <= m } ?: 0
            ">!" -> 1.takeIf { n > m } ?: 0
            "<!" -> 1.takeIf { n < m } ?: 0
            else -> 0
        }
    }
}