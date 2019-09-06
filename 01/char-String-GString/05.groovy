// 使用表达式
def x = 1
def gs = "x = ${x}"
assert gs == 'x = 1'
x = 2
// 虽然x的值被设置为了2,但是gs的值仍然是x = 1
assert gs == 'x = 1'

// 使用闭包
y = 1
def gs2 = "y = ${-> y}"
assert gs2 == 'y = 1'
 
y = 2
// y的值被重置为2, gs2的值会一起变更
assert gs2 == 'y = 2'