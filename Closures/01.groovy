def item = 1

// 闭包中使用外部变量
def closure1 = { item++ }                                          

// 显示的用箭头符号分割参数和方法体
def closure2 = { -> item++ }                                       

// 使用隐式参数
def closure3 = { println it }                                      

// 显式命名参数
def closure4 = { name -> println name }                            

// 使用定义好类型的参数
def closure5 = { String x, int y ->                                
    println "hey ${x} the value is ${y}"
}

// 方法体可以包含多条语句
def closure6 = { reader ->                                         
    def line = reader.readLine()
    line.trim()
}

// 一个参数时，it为默认的变量名
def isEven = { it%2 == 0 }                                  
assert isEven(3) == false                                   
assert isEven.call(2) == true

// Closure也支持可变参数
def concat1 = { String... args -> args.join('') }           
assert concat1('abc','def') == 'abcdef'                     
def concat2 = { String[] args -> args.join('') }            
assert concat2('abc', 'def') == 'abcdef'

def multiConcat = { int n, String... args ->                
    args.join('')*n
}
assert multiConcat(2, 'abc','def') == 'abcdefabcdef'