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
      
  - ## 迭代器
     ### 定义
     `提供一种方法顺序访问一个聚合对象中的每一个元素，而又不需要暴露该对象的内部表示。`
              
     ### 本质
     `控制访问聚合对象中的元素`
              
     ### 适用场景
     1. **如果你希望提供访问一个聚合对象的内容**，但是又不想暴露它的内部表示的时候，可以使用迭代器模式来提供迭代器接口，从而让客户端只是通过迭代器的接口来访问聚合对象，而无需关心聚合对象内部实现。
     
     2. **如果你希望有多种遍历方式可以访问聚合对象**，可以使用迭代器模式。
     
     3. **如果你希望为遍历不同的聚合对象提供一个统一的接口**，可以使用迭代器模式。
     
  - ## 中介者
       ### 定义
       `用一个中介对象类封装一系列的对象的交互。中介者使得各对象不需要显示地相互引用，从而使其耦合松散，而且可以独立的改变它们之间的交互。`
                
       ### 本质
       `封装交互`
                
       ### 适用场景   
       1. **如果一组对象之间的通信方式比较复杂，导致相互依赖、结构混乱**，可以采用中介者模式，把这些对象相互的交互管理起来，各个对象都只需要和中介者交互，从而使得各个对象松散耦合，结构也更清晰易懂。
       
       2. **如果一个对象引用很多的对象，并直接跟这些对象交互，导致难以复用该对象**。可以采用中介者模式，把这个对象跟其它对象的交互封装到中介者对象里面，这个对象就只需要和中介者对象交互就可以了。
  
  - ## 备忘录
  
      ###  定义
      `在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。这样可以将该对象恢复到原先保存的状态。`
                  
      ### 本质
         `保存和恢复内部状态`
                  
      ### 适用场景 
      1. **如果必须保存一个对象在某一个时刻的全部或者部分状态**，这样在以后需要的时候，可以把该对象恢复到先前的状态。可以使用备忘录模式，使用备忘录对象来封装和保存需要保存的内部状态，然后把备忘录对象保存到管理者对象里面，在需要的时候，再从管理者对象里面获取备忘录对象，来恢复对象的状态。
      
      2. **如果需要保存一个对象的内部状态**，但是如果用接口来让其它对象直接得到这些需要保存的状态，将会暴露对象的实现细节并破坏对象的封装性。可以使用备忘录模式，把备忘录对象实现成为原发器对象的内部类，而且还是私有的，从而保证只有原发器对象才能访问该备忘录对象。这样既保存了需要保存的状态，又不会暴露原发器对象的内部实现细节。
      
  - ## 观察者
  
      ###  定义
      `定义对象之间一种一对多的依赖关系，当一个对象的状态发生改变时，所有依赖于它的对象都得到通知并被自动更新。`
                  
      ### 本质
       `触发联动`
                  
      ### 适用场景
      1. **当一个抽象模型有两个方面，其中一个方面的操作依赖于另一个方面的状态变化**，那么就可以选用观察者模式，将这两者封装成观察者和目标对象，当目标对象变化的时候，依赖于它的观察者对象也会发生相应的变化。这样就把抽象模型的这两个方面分离开了，使得它们可以独立的改变和复用。

     2. **如果在更改一个对象的时候，需要同时连带改变其它的对象**，而且不知道究竟应该有多少对象需要被连带改变，这种情况可以选用观察者模式，被更改的那一个对象很明显就相当于是目标对象，而需要连带修改的多个其它对象，就作为多个观察者对象了。

     3. **当一个对象必须通知其它的对象，但是你又希望这个对象和其它被它通知的对象是松散耦合的**，也就是说这个对象其实不想知道具体被通知的对象，这种情况可以选用观察者模式，这个对象就相当于是目标对象，而被它通知的对象就是观察者对象了。
     
  - ## 状态模式
    
       ###  定义
       
       `允许一个对象在其内部状态改变时改变它的行为。对象看起来似乎修改了它的类。`
                    
       ### 本质
       `根据状态来分离和选择行为`
                    
       ### 适用场景   
       1. **如果一个对象的行为取决于它的状态**，而且它必须在运行时刻根据状态来改变它的行为。可以使用状态模式，来把状态和行为分离开，虽然分离开了，但状态和行为是有对应关系的，可以在运行期间，通过改变状态，就能够调用到该状态对应的状态处理对象上去，从而改变对象的行为。
       
       2. **如果一个操作中含有庞大的多分支语句**，而且这些分支依赖于该对象的状态。可以使用状态模式，把各个分支的处理分散包装到单独的对象处理类里面，这样，这些分支对应的对象就可以不依赖于其它对象而独立变化了。
       
  - ## 策略模式
      
       ###  定义
         
       `定义一系列的算法，把它们一个个封装起来，并且使得它们可以相互替换。本模式使得算法可以独立于使用它的客户而变化。`
                      
       ### 本质
       `分离算法，选择实现。`
                      
       ### 适用场景
       1. 出现有许多相关的类，仅仅是行为有差别的情况，可以使用策略模式来使用多个行为中的一个来配置一个类的方法，实现算法动态切换
       
       2. 出现同一个算法，有很多不同的实现的情况，可以使用策略模式来把这些“不同的实现”实现成为一个算法的类层次
       
       3. 需要封装算法中，与算法相关的数据的情况，可以使用策略模式来避免暴露这些跟算法相关的数据结构
       
       4. 出现抽象一个定义了很多行为的类，并且是通过多个if-else语句来选择这些行为的情况，可以使用策略模式来代替这些条件语句
  - ## 模板方法模式
        
       ###  定义
       `定义一个操作中的算法骨架，而将一些步骤延迟到子类中去实现。模板方法使得子类不可以改变算法的结构即可重定义该算法的某些特定的步骤。`
       
       **补充：一些术语** 
       -  原语操作：
       就是在模板中定义的抽象操作，通常是模板方法需要调用的操作，是必需的操作，而且在父类中还没有办法确定下来如何实现，需要子类来真正实现的方法。
       
       - 钩子操作：
       在模板中定义，并提供默认实现的操作。这些方法通常被视为可扩展的点，但不是必须的，子类可以有选择的覆盖这些方法，以提供新的实现来扩展功能。
       **也就是说钩子操作是可以被扩展的点，但不是必须的。**
       
       **两种实现方式：**
       1. 使用继承的方式：抽象方法和具体实现的关系，是在编译期间静态决定的，是类级的关系；
       2. 使用Java回调的方式：经常使用匿名内部类的方式来进行实现，更加灵活。这个关系是在运行期间动态决定的，是对象级的关系。
           
      ### 本质
      `固定骨架算法。`
                        
      ### 适用场景
      1. 需要固定定义算法骨架，实现一个算法的不变的部分，并把可变的行为留给子类来实现的情况；
      
      2. 各个子类中具有公共行为，应该抽取出来，集中在一个公共类中去实现，从而避免代码重复；
      
      3. 需要控制子类扩展的情况。模板方法模式会在特定的点来调用子类的方法，这样只允许在这些点进行扩展；     
      
      ### 模板方法模式和策略模式的区别
      这两个模式的功能有些相似，但是是有区别的。
      
      从表面上看，`两个模式都能实现算法的封装，但是模板方法封装的是算法的骨架，这个算法骨架是不变的，变化的是算法中某些步骤的具体实现；而策略模式是把某个步骤的具体实现算法封装起来，所有封装的算法对象是等价的，可以相互替换。`
      
      因此，可以`在模板方法中使用策略模式，就是把那些变化的算法步骤通过使用策略模式来实现`，但是具体选取哪个策略还是要由外部来确定，`而整体的算法步骤，也就是算法骨架就由模板方法来定义了。`
  - ## 访问者模式
    ### 定义
    `表示一个作用于某对象结构中各元素的操作。它使得开发者在可以不改变各元素的类的前提下定义作用于这些元素的新操作。`
    ### 本质
    `预留通路，回调实现。`
    ### 适用场景
    1. 如果想对一个对象结构，实施一些依赖于对象结构中的具体类的操作，可以使用访问者模式。
    
    2. 如果想对一个对象结构中的各个元素，进行很多不同的而且不相关的操作，为了避免这些操作使得类变得杂乱，可以使用访问者模式，把这些操作分散到不同的访问者对象中去，每个访问者对象实现同一类功能。
    
    3. 如果对象结构很少变动，但是需要经常给对象结构中的元素对象定义新的操作，可以使用访问者模式。
    
  - ## 空对象 
    ### 定义
    `空对象模式提供一个给定类型的空对象代理，这个空对象不执行任何动作，对它的合作对象隐藏细节。`
    ### 优点
       - 可以加强系统的稳固性，能有有效地防止空指针报错对整个系统的影响，使系统更加稳定。
       - 能够实现对空对象情况的定制化的控制，能够掌握处理空对象的主动权。
       - 并不依靠Client来保证整个系统的稳定运行。
       - 通过isNull对==null的替换，显得更加优雅，更加易懂。
       
       
  ## 结构型
   
 - ## 适配器
   ### 定义
     `将一个类的接口转换成客户端希望的另外一个接口。适配器模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。`
   ### 本质
     `转化匹配，复用功能。`
   ### 适用场景
     1. 如果你想要使用一个已经存在的类，但是它的接口不符合你的需求，这种情况可以使用适配器模式，来把已有的实现转换成你需要的接口
     
     2. 如果你想创建一个可以复用的类，这个类可能和一些不兼容的类一起工作，这种情况可以使用适配器模式，到时候需要什么就适配什么
     
     3. 如果你想使用一些已经存在的子类，但是不可能对每一个子类都进行适配，这种情况可以选用对象适配器，直接适配这些子类的父类就可以了。
     
  - ## 桥接
     ### 定义
       `将抽象部分与它的实现部分分离，使它们都可以独立地变化。`
     **注意：**
       在桥接模式中的桥接是**单向**的，也就是只能是抽象部分的对象去使用具体实现部分的对象，而不能反过来，也就是个单向桥。
     ### 本质
       `分离抽象和实现。`
     ### 适用场景   
     1. **如果你不希望在抽象和实现部分采用固定的绑定关系**，可以采用桥接模式，来把抽象和实现部分分开，然后在程序运行期间来动态的设置抽象部分需要用到的具体的实现，还可以动态切换具体的实现。
     
     2. **如果出现抽象部分和实现部分都应该可以扩展的情况**，可以采用桥接模式，让抽象部分和实现部分可以独立的变化，从而可以灵活的进行单独扩展，而不是搅在一起，扩展一边会影响到另一边。
     
     3. **如果希望实现部分的修改，不会对客户产生影响**，可以采用桥接模式，客户是面向抽象的接口在运行，实现部分的修改，可以独立于抽象部分，也就不会对客户产生影响了，也可以说对客户是透明的。
     
     4. **如果采用继承的实现方案，会导致产生很多子类**，对于这种情况，可以考虑采用桥接模式，分析功能变化的原因，看看是否能分离成不同的纬度，然后通过桥接模式来分离它们，从而减少子类的数目。
     
  - ## 组合模式
      ### 定义
         `将对象组合成树形结构以表示“部分-整体”的层次结构。组合模式使得用户对单个对象和组合对象的使用具有一致性。`
      ### 本质
         `统一叶子对象和组合对象。`
       ### 适用场景
       1. **如果你想表示对象的部分-整体层次结构**，可以选用组合模式，把整体和部分的操作统一起来，使得层次结构实现更简单，从外部来使用这个层次结构也简单；
       
       2. **如果你希望统一的使用组合结构中的所有对象**，可以选用组合模式，这正是组合模式提供的主要功能；
  
  - ## 装饰模式
      ### 定义
           `动态地给一个对象添加一些额外的职责。就增加功能来说，装饰模式比生成模式更加灵活。`
      ### 本质
           `功能细化，动态组合。`
      ### 适用场景
      1. **如果需要在不影响其它对象的情况下**，以动态、透明的方式给对象添加职责，可以使用装饰模式，这几乎就是装饰模式的主要功能
            
      2. **如果不合适使用子类来进行扩展的时候**，可以考虑使用装饰模式，因为装饰模式是使用的“对象组合”的方式。所谓不适合用子类扩展的方式，比如：扩展功能需要的子类太多，造成子类数目呈爆炸性增长。
      
 - ## 外观模式
      ### 定义
      `为子系统中的一组接口提供了一个一致的界面，外观模式定义了一个高层接口，这个接口是的这一子系统更加容易使用。`
      ### 本质
      `封装交互，简化调用。`
      ### 适用场景     
      1. **如果你希望为一个复杂的子系统提供一个简单接口的时候**，可以考虑使用外观模式，使用外观对象来实现大部分客户需要的功能，从而简化客户的使用；
      
      2. **如果想要让客户程序和抽象类的实现部分松散耦合**，可以考虑使用外观模式，使用外观对象来将这个子系统与它的客户分离开来，从而提高子系统的独立性和可移植性；
      
      3. **如果构建多层结构的系统**，可以考虑使用外观模式，使用外观对象作为每层的入口，这样可以简化层间调用，也可以松散层次之间的依赖关系；
      
 - ## 享元模式
      ### 定义
      `利用共享技术有效地支持大量细粒度的对象。`
      **补充：**
      - 享元模式设计的重点就在于分离变与不变，把一个对象的状态分成内部状态和外部状态，内部状态是不变的，外部状态是可变的。
      - 享元模式真正缓存和共享的数据是享元的内部状态，而外部状态是不应该被缓存共享的。
      - 内部状态和外部状态是独立的，外部状态的变化不应该影响到内部状态。
       
      ### 本质
      `分离和共享`
      
      ### 适用场景 
      1. **如果一个应用程序使用了大量的细粒度对象**，可以使用享元模式来减少对象数量；
      
      2. **如果由于使用大量的对象，造成很大的存储开销**，可以使用享元模式来减少对象数量，并节约内存；
      
      3. **如果对象的大多数状态都可以转变为外部状态**，比如通过计算得到，或是从外部传入等，可以使用享元模式来实现内部状态和外部状态的分离；
      
      4. **如果不考虑对象的外部状态**，可以用相对较少的共享对象取代很多组合对象，可以使用享元模式来共享对象，然后组合对象来使用这些共享对象；
      
      
      
      
      
            
            
       
     
     
     
      
      
      
       
       
       
       
       

      
          
       
     

        
        
    
 ***
    
  ## 参考资料
   
  来源：[简书](http://jianshu.com)
  
  作者：[猿码道](https://www.jianshu.com/nb/4583287)
 
