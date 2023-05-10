package singletonPattern;

/**
 * 在未使用单例模式的代码中，每次创建一个新的 Database 对象都会创建一个新的数据库连接。这可能会导致系统负担过重，因为每次创建对象都需要进行一些开销较大的操作。
 * 而在使用单例模式的代码中，我们确保只有一个 Database 对象，并且只有在第一次调用 getInstance() 方法时才会创建数据库连接。这可以降低系统负担并提高性能。
 * 总之，单例模式可以确保一个类只有一个实例，并提供全局访问点，这在某些情况下非常有用。
 */
public class Database {
    private static Database instance;

    private Database() {
        // 创建数据库连接
    }

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public void query() {
        System.out.println(instance.hashCode());
    }
}