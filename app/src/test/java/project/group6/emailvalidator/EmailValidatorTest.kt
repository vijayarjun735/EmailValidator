package project.group6.emailvalidator

import org.junit.Assert.*
import org.junit.Test

class EmailValidatorTest {

    @Test
    fun validEmailFormat() {
        assertTrue(EmailValidator.isValidEmail("123@abc.com"))
    }

    @Test
    fun validEmailSubdomainFormat() {
        assertTrue(EmailValidator.isValidEmail("123@abc.co.ca"))
    }

    @Test
    fun invalidEmailMissingDomain() {
        assertFalse(EmailValidator.isValidEmail("123@abc"))
    }

    @Test
    fun invalidEmailDoubleDots() {
        assertFalse(EmailValidator.isValidEmail("123@abc..com"))
    }

    @Test
    fun invalidEmailNoUsername() {
        assertFalse(EmailValidator.isValidEmail("@abc.com"))
    }

    @Test
    fun invalidEmailNoDomain() {
        assertFalse(EmailValidator.isValidEmail("testing123"))
    }

    @Test
    fun invalidEmailEmptyString() {
        assertFalse(EmailValidator.isValidEmail(""))
    }

    @Test
    fun invalidEmailNull() {
        assertFalse(EmailValidator.isValidEmail(null))
    }
}
