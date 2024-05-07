package chapter8

sealed class Result {
    class Success(val value: Any) : Result() {
        fun showResult() {
            println(value)
        }
    }

    class Error(val message: String) : Result() {
        fun throwException() {
            throw Exception(message)
        }
    }
}

fun runComputation(): Result {
    try {
        val a = readlnOrNull()?.toInt() ?: return Result.Error("Missing first argument")
        val b = readlnOrNull()?.toInt() ?: return Result.Error("Missing second argument")

        return Result.Success(a+b)
    } catch (e: NumberFormatException) {
        return Result.Error(e.message ?: "Invalid Input")
    }
}

fun main() {
    val message = when (val result = runComputation()) {
        is Result.Success -> "Completed successfully: ${result.value}"
        is Result.Error -> "Error: ${result.message}"
        else -> return
    }
    println(message)
}