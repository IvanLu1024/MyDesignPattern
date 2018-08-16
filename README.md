# 设计模式
大致分为以下三类：
## 创建型
- ## 单例模式

### 定义：

``保证一个类仅有一个实例，并提供一个访问它的全局访问点。``

### 本质：

``控制实例数目``

### 使用场景：
`` 
当需要控制一个类的实例只能有一个，而且客户只能从一个全局访问点访问它时，
可以选用单例模式，这些功能恰好是单例模式要解决的问题。
``

- ## 简单工厂

### 定义：
``
提供一个创建对象实例的功能，而无须关心器具体实现。被创建实例的类型可以是接口、
抽象类也可以是其他具体的实现类。
``
### 本质：

`选择实现`

### 适用场景：

**如果想要完全封装隔离具体实现** ，让外部只能通过接口来操作封装体，那么可以
选用简单工厂，让客户端通过工厂来获取相应的接口，而无需关心具体实现；
  
**如果想要把对外创建对象的职责集中管理和控制**，可以选用简单工厂，一个简单工厂
可以创建很多的、不相关的对象，可以把对外创建对象的职责集中到一个简单工厂来，从而实现集中管
理和控制。`
 

- ## 工厂方法

### 定义：

``定义一个用于创建对象的接口，让子类决定实例化哪一个类，FactoryMethod使一个类的实例化延迟到其子类。
``

### 本质：

``
延迟到子类来选择实现
``

### 与简单工厂的区别：
``
确实从本质上讲，它们是非常类似的，具体实现上都是在“选择实现”。但是也存在不同点，
简单工厂是直接在工厂类里面进行“选择实现”；而工厂方法会把这个工作延迟到子类来实
现，工厂类里面使用工厂方法的地方是依赖于抽象而不是具体的实现，
从而使得系统更加灵活，具有更好的可维护性和可扩展性。从某个角度来讲，可以认为简
单工厂就是工厂方法模式的一种特例，因此它们的本质是类似的，也就不足为奇了。
``
### 适用场景：

**如果一个类需要创建某个接口的对象**，但是又不知道具体的实现，这种情况可以选用工厂方法模式，
把创建对象的工作延迟到子类去实现。
**如果一个类本身就希望**，由它的子类来创建所需的对象的时候，应该使用工厂方法模式。

- ## 抽象工厂
### 定义

`提供一个创建一系列相关或者相互依赖对象的接口，而无需指定它们的具体类`

 **一定要注意，这个接口内的方法不是任意堆砌的，而是一系列相关或相互依赖的方法**
 
 ### 本质
 
 `选择产品簇的实现`
 
 ### 适用场景
 **如果希望一个系统独立于它的产品的创建，组合和表示的时候**，换句话说，希望一个系统只是知道产品的接口，而不关心实现的时候。

 **如果一个系统要由多个产品系列中的一个来配置的时候**，换句话说，就是可以动态的切换产品簇的时候。

 **如果要强调一系列相关产品的接口**，以便联合使用它们的时候。
 
 - ## 生成器
 ### 定义：
 `将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示`


