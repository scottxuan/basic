package scottxuan.cloud.core.mybatis;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;

/**
 * @author : zhaoxuan
 */
public class MapperReadWriteLock implements ReadWriteLock {
    private Lock lock = new MapperReadWriteLock.DummyLock();

    MapperReadWriteLock() {
    }

    public Lock readLock() {
        return this.lock;
    }

    public Lock writeLock() {
        return this.lock;
    }

    static class DummyLock implements Lock {
        DummyLock() {
        }

        public void lock() {
        }

        public void lockInterruptibly() throws InterruptedException {
        }

        public boolean tryLock() {
            return true;
        }

        public boolean tryLock(long paramLong, TimeUnit paramTimeUnit) throws InterruptedException {
            return true;
        }

        public void unlock() {
        }

        public Condition newCondition() {
            return null;
        }
    }
}
