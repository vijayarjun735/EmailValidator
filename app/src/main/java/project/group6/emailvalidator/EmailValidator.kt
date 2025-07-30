package project.group6.emailvalidator

object EmailValidator {
    fun isValidEmail(email: String?): Boolean {
        if (email.isNullOrEmpty()) return false
        val emailRegex =
            "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}(\\.[A-Za-z]{2,})?$"
        // Prevent double dots
        if (email.contains("..")) return false
        return Regex(emailRegex).matches(email)
    }
}
