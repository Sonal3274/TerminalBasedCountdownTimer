import java.time.LocalDateTime
import java.time.LocalTime
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeParseException
import java.util.Scanner
fun main() {


    // Display the current time
        val currentDateTime = LocalDateTime.now()
        val formattedDateTime = currentDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))
        println("Current time: $formattedDateTime")

        // Take time input from the user
        val scanner = Scanner(System.`in`)

        print("Enter a time (HH:mm:ss): ")
        val userInput = scanner.nextLine()

        val userTime = try {
            LocalTime.parse(userInput, DateTimeFormatter.ofPattern("HH:mm:ss"))
        } catch (e: DateTimeParseException) {
            println("Invalid time format. Please enter time in HH:mm:ss format.")
            return
        }

        println("Entered time: $userTime")


}