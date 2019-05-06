package designpatterns.creational.factory.abstractfactory.simple.carfactory;

/**
 * <p>
 * This is a simple implementation of abstract factory pattern, which is also
 * called as <b><i>simple factory</i></b>. Abstract factory pattern is able to
 * encapsulate several factories (creator classes) as abstractions. However if
 * there is only a single factory to structure, the necessity of abstraction can
 * be overlooked. There are many cases of simple implementations of abstract
 * factory pattern as such.
 * </p>
 * <p>
 * In this example, only the core elements of the factory pattern is pointed
 * out. What are the participants of abstract factory design?
 * <ul>
 * <li><b>AbstractFactory</b> : common representation for operations that create
 * products. -> {@link ICarFactory}</li>
 * <li><b>ConcreteFactory</b> : implementation of creator representations. ->
 * {@link CarFactoryImpl}</li>
 * <li><b>AbstractProduct</b> : common representation for product types. ->
 * {@link ICar}</li>
 * <li><b>ConcreteProduct</b> : product types to be created by the factory. ->
 * {@link CarA}, {@link CarB}, {@link CarC}</li>
 * <li><b>Client</b> caller of services from its dependents ->
 * {@link CarPurchaser}</li>
 * </ul>
 * </p>
 * <p>
 * In this example, the {@link ICarFactory car factory interface} is the
 * abstraction of the creator classes. Since there is only a single creator
 * class, a simple composite structure is enough for this example, which
 * achieved by {@link CarFactoryImpl single car factory implementation}.
 * </p>
 * <p>
 * It is important to understand what is achieved by this creation pattern? Why
 * don't we simply call on to classes where they are necessary for us whenever
 * the construction of the object needed?
 * </p>
 * <p>
 * Simple answer is: <i>to achieve a more composite structure</i>. (Abstract)
 * Factory is a pattern were the subclasses are allowed to call upon the
 * concrete classes they need. In this case, the {@link CarPurchaser} is
 * released from dependencies of its concrete subclasses of Car
 * Types({@link CarA}, {@link CarB} and {@link CarC}). It knows about car types
 * by a third party of {@link CarType car type enumeration}. This makes
 * {@link CarPurchaser} loosely coupled with concrete car type implementations.
 * It also does not know how the {@link CarShop} serves the calls it makes. It
 * is also not tied to the concrete {@link CarShop}. All these abstractions
 * achieve a creational design with inverted dependencies. As long as the
 * business logic stays the same, {@link CarPurchaser} can generate different
 * cars via different factories and different shops.
 * </p>
 * <p>
 * It should be noted that, the creational abstraction could have been achieved
 * in different ways. Such as, instead of interfaces, abstract classes could
 * have been used; or there could have been more concrete factories to choose
 * from or more types of products that are created in the factory. This would
 * lead us to a more complex showcase example for abstract factory. Because of
 * this flexibility of the design, abstract factory is called as <b><i>Factory
 * of Factories</i></b>, while the single case abstract factory implementation
 * can encompass more streamline implementations. However, the fundamental
 * design and the idea is the same.
 * </p>
 * <p>
 * One method to achieve a similar abstraction of creator behavior is to inject
 * a <i>create</i> method, and use that signature in the concrete classes, and
 * implement the abstract signature elsewhere. This way, instead of a concrete
 * implementation of a whole factory class {@link CarFactoryImpl}, only the
 * necessary method could have been designed. This abstract method solution is
 * called as <i>factory method</i>.
 * </p>
 * <p>
 * Although this design pattern has a great potential in practical use, there is
 * one contra point not to miss. use of the factory depends on the third party
 * {@link CarType enumeration} input. the problem is that, any changes on the
 * concrete car types requires a change in the car type enums. There are ways to
 * decrease this dependency. One way is to use a registration mechanism, where
 * all implementing concrete car types has to register to the factory they are
 * linked. However, all in all, it is required to put the type selection
 * dependency at some level.
 * </p>
 * <p>
 * In other examples, we will see how <i>abstract factory</i> design can
 * encapsulate a larger set of products and factories. We will also see how
 * <i>factory method</i> design can simplify a single abstract factory solution.
 * </p>
 * 
 * @author Ozan Aksoy
 *
 */
class TestCarPurchaser {

	public static void main(String[] args) {

		ICarFactory carFactory = new CarFactoryImpl();
		ICarShop carShop = new CarShop(carFactory);
		CarPurchaser carPurchaser = new CarPurchaser(carShop);

		System.out.println(carPurchaser.purchaseCarTypeA().identify());
		System.out.println(carPurchaser.purchaseCarTypeB().identify());
		System.out.println(carPurchaser.purchaseCarTypeC().identify());

	}// End of Main

}// End of Class
