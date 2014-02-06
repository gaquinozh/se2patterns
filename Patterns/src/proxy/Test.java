package proxy;

import java.lang.reflect.Proxy;

import proxy.interfaces.IAnimal;

public class Test {
	public static void main(String... args) {
		IAnimal lion = new Lion();
		IAnimal proxy = (IAnimal) Proxy.newProxyInstance(lion.getClass()
				.getClassLoader(), lion.getClass().getInterfaces(),
				new AnimalInvocationHandler(lion));
		proxy.getSound();
	}
}
