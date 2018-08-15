package creative.singleton;

/**
 * 使用枚举方式实现单例模式
 *
 * 使用枚举来实现单实例控制，会更加简洁，
 * 而且无偿的提供了序列化的机制，并由JVM从根本上提供保障，
 * 绝对防止多次实例化，是更简洁、高效、安全的实现单例的方式。
 */
public enum SingletonEnum{

    // TODO: 2018/8/15 定义一个枚举元素，它就代表着 SingletonEnum的一个实例
    uniqueInstance

}
