# Bridge Design Pattern

Bridge is the application of "composition over inheritance". Without using bridge design pattern, one might apply inheritance to achieve polymorphism, but once the structure gets complex, it becomes very hard to apply changes for the implementation. 

Bridge design pattern is essentially using composition to achieve polymorphism: the classes inherited from abstract level, internally, use interfaces to define its behaviours, and these interfaces then can have various implementation. The change in abstract level (e.g., parent abstract class / interfaces) does not affect the implementation (i.e., implementer), because these implementers are "bridged" together, and they are highly decouples from each other. 


