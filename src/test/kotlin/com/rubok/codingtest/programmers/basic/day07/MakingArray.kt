package com.rubok.codingtest.programmers.basic.day07

class MakingArray {

    fun solution(l: Int, r: Int): IntArray {
        val result = mutableListOf<Int>()

        for (num in l..r) {
            if (isZeroFiveNumber(num)) {
                result.add(num)
            }
        }

        return if (result.isNotEmpty()) result.toIntArray() else intArrayOf(-1)
    }

    private fun isZeroFiveNumber(num: Int): Boolean {
        for (char in num.toString()) {
            if (char != '0' && char != '5') {
                return false
            }
        }
        return true
    }

    fun solution2(l: Int, r: Int): List<Int> {
        return (l..r).filter {
            it.toString()
                .all { ch -> ch == '0' || ch == '5' }
        }.takeIf(List<Int>::isNotEmpty) ?: listOf(-1)
    }
}