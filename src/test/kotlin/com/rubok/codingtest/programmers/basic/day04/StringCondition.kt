package com.rubok.codingtest.programmers.basic.day04

import org.junit.jupiter.api.Test

class StringCondition {

    @Test
    fun test() {
        println(solution("<", "=", 20, 50))
        println(solution(">", "!", 41, 78))
    }

    /**
     * @param ineq: 부등호
     * @param eq: 등호
     * @param n: 첫 번째 숫자
     * @param m: 두 번째 숫자
     * @return 부등호와 등호를 조합하여 n과 m을 비교한 결과를 반환합니다.
     *
     * 부등호와 등호를 조합하여 n과 m을 비교한 결과를 반환합니다.
     * 등호가 있으면 등호를 포함 아니면 등호를 포함하지 않음
     */
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