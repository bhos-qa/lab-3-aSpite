import org.example.PermissionLevel;
import org.example.PermissionManager;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class PermissionManagerTest {

    @Test
    public void testGetRoleName() {
        PermissionManager manager = new PermissionManager();

        Assertions.assertEquals("USER", manager.getRoleName());
    }

    @Test
    public void testSetRoleName() {
        PermissionManager manager = new PermissionManager();

        manager.setRoleName(PermissionLevel.DEVELOPER);
        Assertions.assertEquals("DEVELOPER", manager.getRoleName());

        manager.setRoleName(PermissionLevel.ADMIN);
        Assertions.assertEquals("ADMIN", manager.getRoleName());

        manager.setRoleName(PermissionLevel.USER);
        Assertions.assertEquals("USER", manager.getRoleName());
    }
}
