import static org.junit.jupiter.api.Assertions.*;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AccountTest {
    private Account account;

/*
    @Before
    public void initialize() {

    }
*/

    @Test
    public void newAccountSuccessfullyCreatesAccount() {
        account = new Account(1000, "Test Account", "Asset");
        assertEquals("Test Account", account.getName());
        assertEquals(1000, account.getAccountNumber());
    }

    @Test
    public void setBalanceFunctionsProperly() {
        account = new Account(1000, "Asset Account", "Asset");
        account.setBalance(123.45);
        assertEquals(123.45, account.getBalance(), 0.0);
    }

    @Test
    public void newAccountTypeIsAsset() {
        account = new Account(1000, "Asset Account", "Asset");
        assertEquals("Asset", account.getType());
    }

    @Test
    public void newAccountTypeIsLiability() {
        account = new Account(2000, "Liability Account", "Liability");
        assertEquals("Liability", account.getType());
    }

    @Test
    public void newAccountTypeIsEquity() {
        account = new Account(3000, "Equity Account", "Equity");
        assertEquals("Equity", account.getType());
    }
}