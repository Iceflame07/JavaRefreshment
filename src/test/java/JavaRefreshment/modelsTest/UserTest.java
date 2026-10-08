package JavaRefreshment.modelsTest;
import JavaRefreshment.data.models.User;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class UserTest {

    @Test
    public void testThatYouCanCreateUser(){
        User use = new User(2L,"","","","08012345678","","","","","",+234);
        use.setId(2L);
        use.setCreateUser("");
        use.setFirstName("");
        use.setLastName("");
        use.setPhoneNumber("08012345678");
        use.setAddress("");
        use.setEmail("");
        use.setListOfCountries("");
        use.setState("");
        use.setPassword("");
        use.setCountryCode(+234);
        assertEquals(2L, use.getId());
        assertEquals("", use.getCreateUser());
        assertEquals("", use.getFirstName());
        assertEquals("", use.getLastName());
        assertEquals("08012345678", use.getPhoneNumber());
        assertEquals("", use.getAddress());
        assertEquals("", use.getEmail());
        assertEquals("", use.getListOfCountries());
        assertEquals("", use.getState());
        assertEquals("", use.getPassword());
        assertEquals(+234, use.getCountryCode());
    }

    @Test
    public void testThatYouCanReadUserInput() {
        User user = new User(1L, "", "", "", "08012345678", "", "", "", "", "", +234);
        assertEquals(1L, user.getId());
        assertEquals("", user.getCreateUser());
        assertEquals("", user.getFirstName());
        assertEquals("", user.getLastName());
        assertEquals("08012345678", user.getPhoneNumber());
        assertEquals("", user.getAddress());
        assertEquals("", user.getEmail());
        assertEquals("", user.getListOfCountries());
        assertEquals("", user.getState());
        assertEquals("", user.getPassword());
        assertEquals(+234, user.getCountryCode());
    }

    @Test
    public void testThatYouCanUpdateUserInput() {
        User user = new User(1L, "", "", "", "08123456789", "", "", "", "", "newPassword456", +234);
        user.setFirstName("");
        user.setLastName("");
        user.setPhoneNumber("08123456789");
        user.setAddress("");
        user.setEmail("");
        user.setState("");
        user.setPassword("newPassword456");
        assertEquals(1L, user.getId());
        assertEquals("", user.getCreateUser());
        assertEquals("", user.getFirstName());
        assertEquals("", user.getLastName());
        assertEquals("08123456789", user.getPhoneNumber());
        assertEquals("", user.getAddress());
        assertEquals("", user.getEmail());
        assertEquals("", user.getListOfCountries());
        assertEquals("", user.getState());
        assertEquals("newPassword456", user.getPassword());
        assertEquals(+234, user.getCountryCode());
    }

    @Test
    public void testThatYouCanDeleteUserInput() {
        User user = new User(0L, "", "", "", "", "", "", "", "", "", +234);
        user.setId(null);
        user.setCreateUser(null);
        user.setFirstName(null);
        user.setLastName(null);
        user.setPhoneNumber(null);
        user.setAddress(null);
        user.setEmail(null);
        user.setListOfCountries(null);
        user.setState(null);
        user.setPassword(null);
        user.setCountryCode(0);
        assertNull(user.getId());
        assertNull(user.getCreateUser());
        assertNull(user.getFirstName());
        assertNull(user.getLastName());
        assertNull(user.getPhoneNumber());
        assertNull(user.getAddress());
        assertNull(user.getEmail());
        assertNull(user.getListOfCountries());
        assertNull(user.getState());
        assertNull(user.getPassword());
        assertEquals(0, user.getCountryCode());;
    }
}
