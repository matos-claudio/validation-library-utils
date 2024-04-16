package br.com.claudio.validation_utils


class Utils {
    //Daqui para baixo, metodos estaticos
    companion object {
        fun isValidCPF(cpf: String): Boolean {
            val numbers = cpf.filter { it.isDigit() }.map { it.toString().toInt() }
            if (numbers.size != 11 || numbers.toSet().size == 1) return false
            val dv1 = numbers.take(9).mapIndexed { index, value -> value * (10 - index) }.sum() % 11 % 10
            val dv2 = (numbers.take(9) + dv1).mapIndexed { index, value -> value * (11 - index) }.sum() % 11 % 10
            return numbers[9] == dv1 && numbers[10] == dv2
        }
    }
}