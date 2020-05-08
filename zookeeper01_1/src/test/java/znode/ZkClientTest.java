package znode;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import znode.ZkClientCrud;

@RunWith(JUnit4.class)
public class ZkClientTest {
    @Test
    public void crudTest() {
        ZkClientCrud zkClientCrud = new ZkClientCrud();
        User user = new User();
        user.setAge(18);
        user.setName("ww");
        zkClientCrud.createPersistents("/aaa", user);
    }
}
