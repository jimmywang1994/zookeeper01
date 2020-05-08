package znode;

import org.apache.zookeeper.ZooKeeper;

import java.io.IOException;

public class ZookeeperCrud {

    private String connectString = "192.168.1.130:2181";
    private ZooKeeper zookeeper;

    public ZookeeperCrud() {
        try {
            zookeeper = new ZooKeeper(connectString,5000,null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ZookeeperCrud(ZooKeeper zookeeper) {
        this.zookeeper = zookeeper;
    }
}
