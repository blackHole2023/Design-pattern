package Proxy;

/**
 * 在代理模式的情况下，当调用 display() 方法时，代理对象会检查是否已经创建了真实的图像对象。
 * 如果尚未创建，则会创建一个真实的图像对象并调用其 display() 方法。这种延迟加载的方式可以在需要时创建并使用真实对象，避免了不必要的资源消耗。
 *
 * 而在没有使用代理模式的情况下，直接创建并使用真实的图像对象，无法实现延迟加载的效果。
 *
 * 通过代理模式，我们可以控制对真实对象的访问，并在必要时添加额外的逻辑，
 * 例如延迟加载、权限控制、缓存等，从而提供更灵活和可扩展的功能。
 */
public class Main {
    public static void main(String[] args) {
        // 使用代理模式
        Image imageProxy = new ProxyImage("image.jpg");
        imageProxy.display();

        System.out.println();

        // 没有使用代理模式
        Image realImage = new RealImage("image.jpg");
        realImage.display();
    }
}

