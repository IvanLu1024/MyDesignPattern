# 设计模式
大致分为以下三类：

## 创建型
- ## 单例模式

### 定义：

``保证一个类仅有一个实例，并提供一个访问它的全局访问点。``

### 本质：

``控制实例数目``

### 使用场景：

当需要控制一个类的实例只能有一个，而且客户只能从一个全局访问点访问它时，
可以选用单例模式，这些功能恰好是单例模式要解决的问题。


- ## 简单工厂

### 定义：
``
提供一个创建对象实例的功能，而无须关心器具体实现。被创建实例的类型可以是接口、
抽象类也可以是其他具体的实现类。
``
### 本质：

`选择实现`

### 适用场景：

1. **如果想要完全封装隔离具体实现** ，让外部只能通过接口来操作封装体，那么可以
选用简单工厂，让客户端通过工厂来获取相应的接口，而无需关心具体实现；
  
2. **如果想要把对外创建对象的职责集中管理和控制**，可以选用简单工厂，一个简单工厂
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

1. **如果一个类需要创建某个接口的对象**，但是又不知道具体的实现，这种情况可以选用工厂方法模式，
把创建对象的工作延迟到子类去实现。

2. **如果一个类本身就希望**，由它的子类来创建所需的对象的时候，应该使用工厂方法模式。

- ## 抽象工厂
### 定义

`提供一个创建一系列相关或者相互依赖对象的接口，而无需指定它们的具体类`

 **一定要注意，这个接口内的方法不是任意堆砌的，而是一系列相关或相互依赖的方法**
 
 ### 本质
 
 `选择产品簇的实现`
 
 ### 适用场景
 1. **如果希望一个系统独立于它的产品的创建，组合和表示的时候**，换句话说，希望一个系统只是知道产品的接口，而不关心实现的时候。

 2. **如果一个系统要由多个产品系列中的一个来配置的时候**，换句话说，就是可以动态的切换产品簇的时候。

 3. **如果要强调一系列相关产品的接口**，以便联合使用它们的时候。
 
 - ## 生成器
 ### 定义：
 `将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示`
 ### 本质：
 `分离整体构建算法和部件构造`
 
 ### 适用场景
 
  1. **如果创建对象的算法**，应该独立于该对象的组成部分以及它们的装配方式时；
 
  2. **如果同一个构建过程有着不同的表示时**
  
  - ## 原型模式
  ### 定义：
  `用原型实例指定创建对象的种类，并通过拷贝这些原型创建新的对象`
  
  ### 本质：
  `克隆生成对象`
  
  ### 适用场景
  1. **如果一个系统想要独立于它想要使用的对象时**，可以使用原型模式，让系统只面向接口编程，在系统需要新的对象的时候，可以通过克隆原型来得到；
   
  2. **如果需要实例化的类是在运行时刻动态指定时**，可以使用原型模式，通过克隆原型来得到需要的实例；
  
     
   ## 行为型
   - ## 责任链
   ### 定义
   `使得多个对象都有机会处理请求，从而避免请求发送者和接受者之前的耦合关系。将这些对象连成一条链，并沿着这条链传递请求，直到有一个对象将它处理完为止。`
   
   ### 本质
  `分离职责，动态组合` 
  
  ### 适用场景
  1. **如果有多个对象可以处理同一个请求**，但是具体由哪个对象来处理该请求，是运行时刻动态确定的。这种情况可以使用职责链模式，把处理请求的对象实现成为职责对象，然后把它们构成一个职责链，当请求在这个链中传递的时候，具体由哪个职责对象来处理，会在运行时动态判断。
  
  2. **如果你想在不明确指定接收者的情况下**，向多个对象中的一个提交一个请求的话，可以使用职责链模式，职责链模式实现了请求者和接收者之间的解耦，请求者不需要知道究竟是哪一个接收者对象来处理了请求。
  
  3. **如果想要动态指定处理一个请求的对象集合**，可以使用职责链模式，职责链模式能动态的构建职责链，也就是动态的来决定到底哪些职责对象来参与到处理请求中来，相当于是动态指定了处理一个请求的职责对象集合。
  
  - ## 命令
     ### 定义
     `将一个请求封装成一个对象，从而使你可以用不同的请求对客户进行参数化；对请求排队或记录请求日志，以及支持可撤销的操作。`
     
     ### 本质
     `封装请求`
    
    ### 适用场景
    1. **如果需要抽象出需要执行的动作**，并参数化这些对象，可以选用命令模式，把这些需要执行的动作抽象成为命令，然后实现命令的参数化配置
    
    2. **如果需要在不同的时刻指定、排列和执行请求**，可以选用命令模式，把这些请求封装成为命令对象，然后实现把请求队列化
    
    3. **如果需要支持取消操作**，可以选用命令模式，通过管理命令对象，能很容易的实现命令的恢复和重做的功能
    
    4. **如果需要支持当系统崩溃时**，能把对系统的操作功能重新执行一遍，可以选用命令模式，把这些操作功能的请求封装成命令对象，然后实现日志命令，就可以在系统恢复回来后，通过日志获取命令列表，从而重新执行一遍功能
    
    5. **在需要事务的系统中**，可以选用命令模式，命令模式提供了对事务进行建模的方法，命令模式有一个别名就是Transaction。
    
    - ## 解释器
      ### 定义
      `给定一个语言，定义它的文法的一种表示，并定义一个解释器，这个解释器使用该表示来解释语言中的句子。文法简单的理解为“语法规则”`
        
      ### 本质
      `分离实现，解释执行`
        
      ### 适用场景
      1. 当有一个语言需要解释执行，并且可以将该语言中的句子表示为一个抽象语法树的时候，可以考虑使用解释器模式。
        
      2. 在使用解释器模式的时候，还有两个特点需要考虑，一个是语法相对应该比较简单，太复杂的语法不合适使用解释器模式；另一个是效率要求不是很高，对效率要求很高的情况下，不适合使用解释器模式。
        
        
    
     ---
    
  ## 参考资料
   
  来源：[简书](http://jianshu.com)
  
  作者：[猿码道](https://www.jianshu.com/nb/4583287)
 
