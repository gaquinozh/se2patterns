package proxy;

import java.lang.reflect.Proxy;

public class Test {
	public static void main(String... args) {
		Animal lion = new Lion();
		Animal proxy = (Animal) Proxy.newProxyInstance(lion.getClass()
				.getClassLoader(), lion.getClass().getInterfaces(),
				new AnimalInvocationHandler(lion));
		proxy.getSound();
	}
}
