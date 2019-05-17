## 迭代器模式

提供一种访问顺序，访问聚合对象内部的每一个元素，隐藏元素遍历的细节。
让获取聚合对象的每一个元素的方式与遍历解耦。

如：在PancakeHouseMenu和DinnerIterator中，内部实现了获取下一个元素的方法
，而外部无需知道如何实现，只关注调用next方法获取下一个就行了

