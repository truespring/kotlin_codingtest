package com.rubok.codingtest.programmers.basic.day05

class ArrayQueries3 {

    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        queries.forEach {
            val temp = arr[it[0]]
            arr[it[0]] = arr[it[1]]
            arr[it[1]] = temp
        }
        return arr
    }

    fun solution2(arr: IntArray, queries: Array<IntArray>): IntArray {
        queries.forEach { (first, second) ->
            arr[first] = arr[second].also { arr[second] = arr[first] }
        }
        return arr
    }
}
