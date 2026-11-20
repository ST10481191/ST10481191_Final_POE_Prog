package com.mycompany.poepart1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class poeUnitTest {
    
    account acc;
    
    @Test
    public void testValidUsername() {
        acc = new account("osi_9", "Udeh_@99", "+27751042303", "Ositadima", "Udeh");
        assertEquals(true, acc.checkUserName());
    }
    
    @Test
    public void testInvalidUsername() {
        acc = new account("ositadima", "Udeh_@99", "+27751042303", "Ositadima", "Udeh");
        assertEquals(false, acc.checkUserName());
    }
    
    @Test
    public void testValidPassword() {
        acc = new account("osi_9", "Udeh_@99", "+27751042303", "Ositadima", "Udeh");
        assertEquals(true, acc.checkPasswordComplexity());
    }
    
    @Test
    public void testInvalidPassword() {
        acc = new account("osi_9", "udeh_@99", "+27751042303", "Ositadima", "Udeh");
        assertEquals(false, acc.checkPasswordComplexity());
    }
    
    @Test
    public void testValidPhone() {
        acc = new account("osi_9", "Udeh_@99", "+27751042303", "Ositadima", "Udeh");
        assertEquals(true, acc.checkCellPhoneNumber());
    }
    
    @Test
    public void testInvalidPhone() {
        acc = new account("osi_9", "Udeh_@99", "0751042303", "Ositadima", "Udeh");
        assertEquals(false, acc.checkCellPhoneNumber());
    }
    
    @Test
    public void testLoginSuccess() {
        acc = new account("osi_9", "Udeh_@99", "+27751042303", "Ositadima", "Udeh");
        assertEquals(true, acc.loginUser("osi_9", "Udeh_@99"));
    }
    
    @Test
    public void testLoginFail() {
        acc = new account("osi_9", "Udeh_@99", "+27751042303", "Ositadima", "Udeh");
        assertEquals(false, acc.loginUser("osi_9", "wrong"));
    }
}