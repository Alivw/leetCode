package 数组的中心索引;

class People {
    String name;
    public People() {
        System.out.print(1);
    }
    public People(String name) {
        System.out.print(2);
        this.name = name;
    }
}
class Child extends People {
    People father;
    public Child(String name) {
        System.out.print(3);
        this.name = name;
        father = new People(name + ":F");
    }
}