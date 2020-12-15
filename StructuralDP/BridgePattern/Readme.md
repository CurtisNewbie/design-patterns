# Bridge Design Pattern

Bridge design pattern aims to decouples abstraction from implementation: the abstraction level defines a set of behaviours, and the child classes of it, internally, use interfaces to "implement" their behaviours, and these interfaces then can have various implementation. The change in abstract level (e.g., parent abstract class / interfaces) does not affect the actural implementation (i.e., implementer), because these implementers are "bridged" together, and they are highly decoupled from each other. Plus, abstraction and implementation are bound at run time. 


