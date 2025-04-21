/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package part1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
/**
 *
 * @author lab_services_student
 */
public class loginTest {
    
    private login login;
    
         @BeforeEach
     public void setUp() {
        login = new login();
        login.setFirstName("hazel");
        login.setLastName("lani");
        login.setUsername("kyl_1");
        login.setPassword("Ch&&sec@ke99!");
        login.setCellNumber("+2783896896");
    }

    @Test
    void testCheckUserName_Valid() {
        assertTrue(login.checkUserName());
    }
    
    @Test
    void testCheckUserName_Invalid() {
        login.setUsername("invalid");
        assertFalse(login.checkUserName());
    }
    
    @Test
    void testCheckPasswordComplexity_Valid() {
        assertTrue(login.checkPasswordComplexity());
    }
    @Test
    void testCheckPasswordComplexity_Invalid() {
        login.setPassword("weak");
        assertFalse(login.checkPasswordComplexity());
    }
    
    @Test
    void testCheckCellPhoneNumber_Valid() {
        assertTrue(login.checkCellPhoneNumber());
    }
    
    @Test
    void testCheckCellPhoneNumber_Invalid() {
        login.setCellNumber("783896896");
        assertFalse(login.checkCellPhoneNumber());
        }
    
    @Test
    void testLoginUser_Successful() {
        assertTrue(login.loginUser("kyl_1", "Ch&&sec@ke99!"));
    }
    
    @Test
    void testLoginUser_Failed() {
        assertFalse(login.loginUser("wrong", "credentials"));
    }
    
    @Test
    void testReturnLoginStatus_Success() {
        String expected = "Welcome hazel,lani it is great to see you again.";
        assertEquals(expected, login.returnLoginStatus(true));
    
    }
     
    @Test
    void testReturnLoginStatus_Failure() {
        String expected = "Username or password incorrect, please try again.";
        assertEquals(expected, login.returnLoginStatus(false));
    }
}