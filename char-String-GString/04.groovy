// 默认为null
assert "null" == "${}"

// 使用相对复杂的表达式， 虽然能这样，但是最好还是保持简洁
assert "4" == "${ a = 1; b = 3; a+b }"

// 插值.号表达式
def var1 = "hello"
assert "hello" == "${var1.toString()}"
try {
  assert "hello" == "$var1.toString()"
  assert false: 'will fail - not allowed'
} catch (MissingPropertyException e) {
}

// $符号转译
// 编译错误
// assert 'hello $' == "hello $"
assert 'hello $' == "hello \$"
