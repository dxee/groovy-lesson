// 既然是Closure实例，就可以分配给一个变量
def listener = { e -> println "Clicked on $e.source" }      
assert listener instanceof Closure

// 如果不使用def， 可以直接赋值给Closure变量
Closure callback = { println 'Done!' }

// 通过指定范型来指定Closure的返回值类型
Closure<Boolean> isTextFile = {
    File it -> it.name.endsWith('.txt')                     
}