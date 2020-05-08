package znode;

import org.I0Itec.zkclient.ZkClient;
import org.I0Itec.zkclient.ZkServer;
import org.I0Itec.zkclient.serialize.SerializableSerializer;
import org.I0Itec.zkclient.serialize.ZkSerializer;

public class ZkClientCrud<T> {
    private ZkClient zkClient;

    public ZkClientCrud() {
        this.zkClient = new ZkClient("192.168.1.130:2181", 5000, 5000, new SerializableSerializer());
    }

    public void createPersistents(String path, Object data) {
        zkClient.createPersistent(path, data);
    }

    public T readData(String path) {
        return zkClient.readData(path);
    }
}
