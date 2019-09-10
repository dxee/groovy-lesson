class Person {
    String name
    def pretty = { "My name is $name" }
    String toString() {
        pretty()
    }
}
class Thing {
    String name
}

def p = new Person(name: 'Sarah')
def t = new Thing(name: 'Teapot')

assert p.toString() == 'My name is Sarah'
p.pretty.delegate = t
// 默认使用Owner的属性
assert p.toString() == 'My name is Sarah'


// 改变resolveStrategy，会
p.pretty.resolveStrategy = Closure.DELEGATE_FIRST
assert p.toString() == 'My name is Teapot'