package chapter6

fun WeekDay.isWeekEnd() =
    this == WeekDay.SATURDAY || this == WeekDay.SUNDAY

fun main() {
    println(WeekDay.FRIDAY.isWeekEnd())
}