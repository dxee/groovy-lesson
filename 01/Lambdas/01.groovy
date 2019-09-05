// Java风格的Lambdas
list = [1,2,3]

// Lambdas
Runnable run = { println 'run' }
run.call()

// 方法引用，类似JAVA 8的list.forEach(System.out::println);
list.each { println it }
// 或者
list.each(this.&println)