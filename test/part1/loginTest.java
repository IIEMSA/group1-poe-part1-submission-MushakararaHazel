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
        login.setFirstName("John");
        login.setLastName("Doe");
        login.setUsername("use_1");
        login.setPassword("ValidPass1!");
        login.setCellNumber("+27123456789");
    }

    @Test
    public void testCheckUserName() {
    }

    @Test
    public void testCheckPasswordComplexity() {
    }

    @Test
    public void testCheckCellPhoneNumber() {
    }

    @Test
    public void testRegisterUser() {
    }

    @Test
    public void testLoginUser() {
    }

    @Test
    public void testReturnLoginStatus() {
    }

    @Test
    public void testGetUsername() {
    }

    @Test
    public void testSetUsername() {
    }

    @Test
    public void testGetPassword() {
    }

    @Test
    public void testSetPassword() {
    }

    @Test
    public void testGetCellPhoneNumber() {
    }

    @Test
    public void testSetCellNumber() {
    }

    @Test
    public void testGetFirstName() {
    }

    @Test
    public void testSetFirstName() {
    }

    @Test
    public void testGetLastName() {
    }

    @Test
    public void testSetLastName() {
    }
    
}
