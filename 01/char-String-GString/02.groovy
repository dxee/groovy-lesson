String func(String string) {
    return "String param is $string"
}

String func(char chr) {
    return "Char param is $chr"
}

assert 'String param is x' == func('x')
assert 'Char param is x' == func((char)'x')

char func2() {
    return 'a'
}

def var1 = func2()
assert var1.class == Character

char func3() {
    return 'ax' as char
}

def var2 = func3()
assert var2.class == Character