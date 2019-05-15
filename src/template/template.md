##  模板方法模式的定义

父类定义了一组算法的框架，具体实现细节由子类实现。

如本例子中，泡饮料需要经过4个步骤：烧开水、在杯子加入饮料粉、冲入开水、加入调料。

在父类中定义了这4个方法（boilWater、brew、pourInCup、addCondiments），并在prepareRecipe方法中依次调用

boilWater和pourInCup是公共的，brew和addCondiments需要子类实现



