import java.util.List;


/*
 * 聚合关系：与关联关系差不多，但两个类在不同的层次上，一个是整体，一个是部分
 * 如同某个人和全人类的关系，某个人是全人类的部分
 * 聚合关系中，整体不决定部分的生命周期，部分也不决定整体的生命周期
 */
public class JuHe {
	
}

class Human{
	List<Man> m;
	//全人类是整体，整体中应该是部分的集合，整体和部分的集合是关联关系，和部分是聚合关系
	//Human与List是关联关系，与Man是聚合关系
}

class Man{//某个人是部分
	
}