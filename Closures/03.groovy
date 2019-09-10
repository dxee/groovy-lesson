def isOdd = { int i -> i%2 != 0 }
// 直接调用                      
assert isOdd(3) == true
// 通过call方法调用
assert isOdd.call(2) == false