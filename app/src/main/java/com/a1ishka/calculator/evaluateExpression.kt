package com.a1ishka.calculator

import java.math.BigDecimal

fun evaluateExpression(str: String): BigDecimal {

    data class Data(val rest: List<Char>, val value: BigDecimal)

    return object : Any() {

        fun parse(chars: List<Char>): BigDecimal {
            return getExpression(chars.filter { it != ' ' })
                .also { if (it.rest.isNotEmpty()) throw RuntimeException("Unexpected character: ${it.rest.first()}") }
                .value
        }

        private fun getExpression(chars: List<Char>): Data {
            var (rest, carry) = getTerm(chars)
            while (true) {
                when {
                    rest.firstOrNull() == '+' -> rest = getTerm(rest.drop(1)).also { carry += it.value }.rest
                    rest.firstOrNull() == '-' -> rest = getTerm(rest.drop(1)).also { carry -= it.value }.rest
                    else                      -> return Data(rest, carry)
                }
            }
        }

        private fun getTerm(chars: List<Char>): Data {
            var (rest, carry) = getFactor(chars)
            while (true) {
                when {
                    rest.firstOrNull() == '*' -> rest = getTerm(rest.drop(1)).also { carry *= it.value }.rest
                    rest.firstOrNull() == '/' -> rest = getTerm(rest.drop(1)).also {  carry = carry.divide(it.value) }.rest
                    rest.firstOrNull() == '%' -> rest = getTerm(rest.drop(1)).also { carry %= it.value }.rest
                    else                      -> return Data(rest, carry)
                }
            }
        }

        private fun getFactor(chars: List<Char>): Data {
            return when (val char = chars.firstOrNull()) {
//                '+'              -> getFactor(chars.drop(1)).let { Data(it.rest, +it.value) }
                '+'              -> getFactor(chars.drop(1)).let { Data(it.rest, it.value) }
                '-'              -> getFactor(chars.drop(1)).let { Data(it.rest, -it.value) }
                in '0'..'9', '.' -> getNumber(chars)
                else             -> throw RuntimeException("Unexpected character: $char")
            }
        }

        private fun getNumber(chars: List<Char>): Data {
            val s = chars.takeWhile { it.isDigit() || it == '.' }.joinToString("")
            return Data(chars.drop(s.length), s.toBigDecimal())
        }

    }.parse(str.toList())
}